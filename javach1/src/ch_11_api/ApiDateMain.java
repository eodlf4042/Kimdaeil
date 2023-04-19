package ch_11_api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import sun.net.sdp.SdpProvider;


public class ApiDateMain {

	public static void main(String[] args) throws ParseException {
		// 현재 시간 출력
		// 1. Date 클래스 사용
		
		Date dateToday = new Date();
		
		// Date 객체가 new Date()로 생성되는 순가
		// 해당 Date 객체 내부에 그 떄의 시간이 세팅된다.
		System.out.println(dateToday);
		
		
		
		// 날짜 포맷 설정
		// 2023년 04월 18일 10시 39분 30초
		// SimpleDateFormat 생성자 안에 날짜 포맷 문자열 넣기
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		//.format의 파라미터에 Date 객체를 넣으면
		// 해당 Date 객체의 날짜에 대해 포맷을 적용한 문자열을 리턴
		String strToday = sdf.format(dateToday);
		System.out.println(strToday);
		
		// 2023/04/18 10:39:40
		// 2023.04.18 10:39:40
		sdf = new SimpleDateFormat("yyyy/MM/dd일 HH:mm:ss");
		strToday = sdf.format(dateToday);
		System.out.println(strToday);
		
		
		System.out.println("\n==========================================================\n");
		
		// 2.Calendar
		// .getInstance() 이지만 싱글톤 패턴이 적용되지 않음
		// new Date()와 마차가지로 .getInstance()가 실행된
		// 시점으로 세팅된 Caledar 객체가 생성됨
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday);
		
		// calendar 객체의 .getTime()을 실행하면
		// 해당 calendar 객체에 세팅된 날짜를 가지는
		// Date 객체를 리턴한다.
		Date calToDate = calToday.getTime();
		System.out.println(calToDate);
		
		//날짜 포맷 적용
		strToday = sdf.format(calToDate.getTime());
		System.out.println(strToday);
		
		
		System.out.println("\n==========================================================\n");
		
		// 3. System 클래스 사용
		
		long longToday = System.currentTimeMillis();
		System.out.println(longToday);
		
		
		// 날짜 포멧 적용
		// sdf.format() 은 파라미터로 Date 객체 또는 long 타입을 받는다.
		strToday = sdf.format(longToday);
		System.out.println(strToday);
		
		strToday = sdf.format(0L);
		System.out.println(strToday);
		
		System.out.println("\n==========================================================\n");
		
		
		
		// 다양한 날짜 포맷 만들기
		// 1. 2023/04/18 11:16:33
		// 2. 2023-4-18 오전 11시:16:33
		// 3. 화 오전 11:16:33
		// 4. 화요일 11:16
		// @. 2023.04.18 AM 11:16:33
		
		// 1.
		Date dateNow = new Date();
		sdf = new SimpleDateFormat("1. yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(dateNow));
		
		// 2.
		sdf = new SimpleDateFormat("2. yyyy-M-dd a hh:mm:ss");
		System.out.println(sdf.format(dateNow));
		
		// 3.
		sdf = new SimpleDateFormat("3. E a hh:mm:ss");
		System.out.println(sdf.format(dateNow));
		
		// 4.
		sdf = new SimpleDateFormat("4. E요일  HH:mm");
		System.out.println(sdf.format(dateNow));
		
		// @.
		sdf = new SimpleDateFormat("5. yyyy.MM.dd a hh:mm:ss", Locale.US);
		System.out.println(sdf.format(dateNow));
		
		// 미국날짜는?
		sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
		TimeZone tz = TimeZone.getTimeZone ("Aemrica/York");
		sdf.setTimeZone(tz);
		System.out.println("현재미국 : " +sdf.format(dateNow));
		
		
		System.out.println("\n==========================================================\n");
		
		
		// 문자열 (String) -> Date 객체로 변환
		// 유사) "12314" -> int 타입으로 변환
		// 예시) "2023/04/18", "2023/04/16" 두 날짜 차이 계산
		
		String strTomorrow = "2023/04/19 12:01:10";
		
		
		// strTomorrow 문자열의 날짜 포맷에 대한 sdf 생성
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date dateTomorrow = sdf.parse(strTomorrow);
		System.out.println(dateTomorrow);
		System.out.println(sdf.format(dateTomorrow));
		
		
		String strYesterDay = "23.04.17 09:12:11";
		sdf = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
		Date dateYesterDay = sdf.parse(strYesterDay);
		System.out.println(dateYesterDay);
		
		

		System.out.println("\n==========================================================\n");
		
		// 특정 날짜(23/05/01)에 대한 개체 얻기
		// Date를 얻는다면 "23/05/01" -> sdf.parse 이용
		// Calendar로 얻기
		Calendar cal = Calendar.getInstance();
		
		// .set(년, 월, 일)또는
		// .set(년, 월 일, 시, 분, 초)
		// Month의 경우 1월이 0, 2월이 1, 3월이 2, 12월이 11
		cal.set(2023, 4, 1);
		
		// Calendar 객체를 Date 객체로 변환
		System.out.println(cal.getTime());
		
		// Date 객채를  calendar 객체로 변환
		Date temp = new Date();
		Calendar calTemp = Calendar.getInstance();
		calTemp.setTime(temp);
		System.out.println(temp);
		
		// Date 타입에서 long 날짜 얻기
		System.out.println(temp.getTime());
		
		
		

		System.out.println("\n==========================================================\n");
		
		
		
		// 날짜 꺼내기
		// Calendar 객체가 편하다.
		
		Calendar anyCal = Calendar.getInstance();
		
		// 년도
		
		System.out.println(anyCal.get(Calendar.YEAR));
		
		
		// 월
		System.out.println(anyCal.get(Calendar.MONTH) + 1);
		
		//일
		System.out.println(anyCal.get(Calendar.DATE));
		
		//시
		System.out.println(anyCal.get(Calendar.HOUR)); //0~12시
		System.out.println(anyCal.get(Calendar.HOUR_OF_DAY)); //0~24시
		
		//분
		System.out.println(anyCal.get(Calendar.MINUTE));
		
		//초
		System.out.println(anyCal.get(Calendar.SECOND));
		
		

		System.out.println("\n==========================================================\n");
		
		
		
		
		// 날짜 연산 
		String oneDay = "2023.04.06 12:22:45";
		String twoDay = "2023.06.22 14:31:13";
		
		// Date 타입으로 바꿔주기
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date oneDate = sdf.parse(oneDay);
		Date twoDate = sdf.parse(twoDay);
		
		// 밀리초 값이 더 클수록 최신/미래를 의미
		System.out.println(oneDate.getTime());
		System.out.println(twoDate.getTime());
		
		long diffMillSec = twoDate.getTime() - oneDate.getTime();
		System.out.println(diffMillSec + " 밀리초 차이");
		
		// diffMillSec 를 초 단위로 바꾸기
		
		long difSec = diffMillSec /1000;
		System.out.println(difSec + " 초 차이");
		
		
		long difMin = diffMillSec /60;
		System.out.println(difMin + " 분 차이");
		
		
		long difHour = difMin /60;
		System.out.println(difHour + " 시간 차이");
		
		long difDay = difHour /24;
		System.out.println(difDay + " 일 차이");
		
		// 한출로
		long diff = diffMillSec / 1000 / 60 / 60 / 24;
		diff = diffMillSec / (1000 * 60 * 60 * 24);
		System.out.println(diff + "일 차이");
		
		
		System.out.println("\n==========================================================\n");
		//디데이 계산기
		
		String dday = "2023.05.01";
		
		
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date ddayDate = sdf.parse(dday);
		System.out.println(ddayDate);
		
		
		//  애를 00시 00분 00초로 만들어주어야 한다.
		Date todayDate = new Date();
		String today = sdf.format(todayDate);
		Date parseDate= sdf.parse(today);
		System.out.println(todayDate);
		System.out.println(parseDate);
		

		 long diffMill = parseDate.getTime() - ddayDate.getTime();
		 long diffDay = diffMill / (1000 * 60 * 60 * 24);
		 System.out.println(diffDay);

		// 실행 결과
		// 근로잘의 날까지 d-day = -12

		 
		 
		dday = "2023.03.20";
		ddayDate = sdf.parse(dday);
		
		  diffMill = parseDate.getTime() - ddayDate.getTime();
		  diffDay = diffMill / (1000 * 60 * 60 * 24);
		  System.out.println(diffDay);
		
		
		//실행결과
		// 여러분의 교육 기간 = +30
		
		
			System.out.println("\n==========================================================\n");
			
			
			
			
			// 날짜 연산 
			// 한 날짜를 기준으로 날짜를 더하거나 빼기
			// Calendar 가 편하다.
			
			Calendar toCal = Calendar.getInstance();
			sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			System.out.println(sdf.format(toCal.getTime()));
			
			
			// 3일 뒤
			toCal.add(Calendar.DATE, 3);
			System.out.println(sdf.format(toCal.getTime()));
			
			// 57일 뒤
			
			toCal.add(Calendar.DATE, 57);
			System.out.println(sdf.format(toCal.getTime()));
			
			// 7일 전
			
			toCal.add(Calendar.DATE, -7);
			System.out.println(sdf.format(toCal.getTime()));
			
			// 11달 뒤
			toCal.add(Calendar.MONTH, 11);
			System.out.println(sdf.format(toCal.getTime()));
			
			
			System.out.println("\n==========================================================\n");
			
			
			// 달력만들기
			
		int year = 2023;
		int month = 5;
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		System.out.println(sdf.format(calendar.getTime()));
		
		// 해당 달의 마지막 일자 얻기
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		// 해당 달의 시작 요일
		// 1 : 일요일, 2 : 월요일, 3 :화요일 .... 7 : 토요일
		int starDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(starDay);
		
		System.out.println(year + "년" + month + "월달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int current = 1;
		for(int i =0; i < 42; i++) {
			
			if(i < starDay - 1) {
				System.out.print("\t");
			}else {
				System.out.printf("%2d\t", current);
				current++;
				
				if(current > lastDay) {
					break;
				}
			}
			
			// i가 6, 13, 20, 27, 34 일떄 출력 후 줄바꿈 
			if(i % 7 == 6) {
				System.out.println();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
