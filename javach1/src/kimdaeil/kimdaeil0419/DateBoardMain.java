package kimdaeil.kimdaeil0419;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import com.sun.org.apache.xerces.internal.impl.dv.DVFactoryException;

import ch09_class.nextit.NextStudent;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		
		
        // dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for(int i = 0; i < 100; i++) {
			int randDay = (int)(Math.random() * 365) + 1;		// 1~365	
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);
					
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i+1) + "번째 생성된 글", strDate));
		}
				
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}

//		 //날짜순으로 정렬
//	// 1. 버블 정렬
//		for(int k = 0; k < dbList.size()-1; k++) {
//
//			for(int i = 0; i < dbList.size()-1; i++) {
//				//날짜비교
//				// String date
//				// 2023.02.21 12:34:56 -> Date 객체			
//			Date left =	(Date) sdf.parse(dbList.get(i).getDate());
//			Date right =	(Date) sdf.parse(dbList.get(i+1).getDate());
//	
//				if(left.getTime()< right.getTime()){
//				DateBoard t = dbList.get(i);
//				dbList.set(i, dbList.get(i+1 ));
//					dbList.set(i+1, t); 
//			
//				for(int i = 0; i < dbList.size(); i++) {
//						
//					System.out.println(dbList.get(i));
//					}
//					
//				
//					}
//			}
//	}
//		
//		
		
		System.out.println("\n========================================================================\n");
		
//		
//		Collections.sort(dbList, new Comparator<DateBoard>() {
//
//			@Override
//			public int compare(DateBoard dbA, DateBoard dbB) {
//				int result =	1;
//				 SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		//				try {
//	
//					Date left = (Date) sdf.parse(dbA.getDate());
//					Date right = (Date) sdf.parse(dbA.getDate());
//				}
//				
//				return 0;
//			}
//			
//			
//			
//			
//		});
		
		
		System.out.println("\n========================================================================\n");
		
		
		
//		Calendar cal = Calendar.getInstance();
//		
//		cal.add(Calendar.MONTH, -1);
////		cal.add(Calendar.DATE, -30);
//		
//		 Date today = new Date(0);
//		 long diff = today.getTime() -(1000 * 60 * 60 * 24 * 30L);
//		
//		
//		
//		for(int i = 0; i< dbList.size(); i++) {
//		Date temp =  (Date) sdf.parse(dbList.get(i).getDate());
//		// temp를 밀리초로 나타낸 것이
//		// 한달 전 날짜를 밀리초로 나타낸 것보다 크면
//		// 최근 한달 내 데이터를 의미한다.
//		if(temp.getTime() > cal.getTime().getTime()) {
//			System.out.println(dbList.get(i));
//		}
//		
//		}
		
		
		
		System.out.println("\n========================================================================\n");
		
		// 이번달 게시글
//		 Calendar toMonth = Calendar.getInstance();
//		 
//		 
//		 int year = toMonth.get(Calendar.YEAR);
//		 int month = toMonth.get(Calendar.MONTH);
//		 
//		 System.out.println(year);
//		 System.out.println(month);
//		 
//		 for(int i = 0; i < dbList.size(); i++) {
//			 Date temp = (Date) sdf.parse(dbList.get(i).getDate());
//			 Calendar tempCal = Calendar.getInstance();
//			 tempCal.setTime(temp);
//			 
//			 int tempYear = tempCal.get(Calendar.YEAR);
//			 int tempMonth = tempCal.get(Calendar.MONTH);
//			 
//			 if(year == tempYear && month == tempMonth) {
//				 System.out.println(dbList.get(i));
//			 }
//		 }
		
		
		System.out.println("\n========================================================================\n");
		
//		
//		
//		// 2달 게시글
//		 Calendar toMonth = Calendar.getInstance();
//		 
//		 
//		 int year = toMonth.get(Calendar.YEAR);
//		 int month = 2 -1;
//		 
//		 System.out.println(year);
//		 System.out.println(month);
//		 
//		 for(int i = 0; i < dbList.size(); i++) {
//			 Date temp = (Date) sdf.parse(dbList.get(i).getDate());
//			 Calendar tempCal = Calendar.getInstance();
//			 tempCal.setTime(temp);
//			 
//			 int tempYear = tempCal.get(Calendar.YEAR);
//			 int tempMonth = tempCal.get(Calendar.MONTH);
//			 
//			 if(year == tempYear && month == tempMonth) {
//				 System.out.println(dbList.get(i));
//			 }
//		 }
		
		System.out.println("\n========================================================================\n");
		
		
		String fromStr = "2023.02.14";
		String toStr = "2023.02.14";
		
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		Date fromDate = (Date) sdf.parse(fromStr);
		Date toDate = (Date) sdf.parse(toStr);
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		for(int i = 0; i< dbList.size(); i++) {
			Date temp = (Date) sdf.parse(dbList.get(i).getDate()); 
			
			// temp를 밀리초로 바꾼 값이
			// fromDate를 밀리초로 바꾼것보다 크고
			// toDate를 밀리초로 바꾼것보다 작은것
			if(temp.getTime() >= fromDate.getTime()) {
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
