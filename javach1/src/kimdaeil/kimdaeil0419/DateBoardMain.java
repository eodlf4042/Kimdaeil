package kimdaeil.kimdaeil0419;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class DateBoardMain {

	public static void main(String[] args) {
		
		
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

		 //날짜순으로 정렬



	}

}
