package ch03_system;

public class Comments {

	//자마 문서 (javadoc) 주석
	/**
	 * 바나나 놓치다
	*/
	static String banana = "바나나";
	
	public static void main(String[] args) {
          
		// 주석 (Comments)
		
		// 단일 주석 (코드 앞에 //)
		//참고로 프로그래밍 언어마다 다른주석을 사용하는 경우가
		//많다. (파이썬은 #. sql은 --, html <!-->, ..)
		//단축키는[Ctrl, /]
		/*
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
        */
		/*
		 * 다중 주석 
		 * 작성자 : 정찬웅
		 * 작성일 : 2023-03-22
		 */
		
		// 자바 문서(javadoc) 주석
		String fruits = "Apple";
		fruits.substring(2);
		
		// 보통은 메소드 사용법에 대해 설명하는 용도로 사용
		System.out.println(banana);
		
		//TODO 주석
		// 개발 중간중간에 이후 구현해야할 부분에 대해
		//미리 말로라도 작성을 해놓는 경우 사용
		//Window - Show View -Tasks예 TODO 주석들의 위치가 다 뜸
		
		
		 System.out.println(banana);
		
		
		
	}

}
