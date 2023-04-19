package ch09_class.typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {

	public static void main(String[] args) {
		// 타자연습게임
		Scanner scan = new  Scanner(System.in);

		
		// 단어목록
		
		// static 메소드는 해당 클래스를 궅이 객체로 만들지
		//  안더라도 사용이 가능하다.
		// Math.radom();
		ArrayList<String> wordList = Dictionary.makeWordList(Dictionary.OPTION_RANDOM_ALPHABET);
		System.out.println(Dictionary.OPTION_RANDOM_ALPHABET);
		
		
		
		wordList.add("장유정");
		wordList.add("배준호");
		wordList.add("고동욱");
		wordList.add("박혜라");
		wordList.add("정현진");
		wordList.add("홍민경");
		wordList.add("박진영");
		wordList.add("김대일");
		wordList.add("박창연");
		wordList.add("최성복");
		wordList.add("이자영");
		wordList.add("백민기");
		wordList.add("유동윤");
		wordList.add("강지혜");
		wordList.add("김태윤");
		wordList.add("박준하");
		wordList.add("주예슬");
		wordList.add("윤종현");
		wordList.add("류서영");
		wordList.add("신경호");
		wordList.add("김청아");
		wordList.add("김현곤");
		
		
		
		
		
		
		// 현재 시간을 저장
		// 1970년 1월 1일 기준으로
		// 현재까지 경과된 시간을 미리초 단위로 리턴 (1초 = 1000밀리초)
		long before = System.currentTimeMillis();
		System.out.println(before);
		
		
		while(true) {
			// wordList에 담긴 단어가 랜덤하게 출력
			// = Math.random() 실행 결과가 wordList의 인덱스 중하나
			// = wordList의 인덱스 0 ~ wordList.size()-1
			int randIdx = (int)(Math.random() *wordList.size());
			System.out.println(wordList.get(randIdx));
			
			// 출력된 단어를 입력
			System.out.print(">>>>");
			String input = scan.nextLine();
			// 입력한 단어가 출려된 단어와 일치하는지 체크
			if(wordList.get(randIdx).equals(input)) {
				// 일치 한다면 wordList에서 해당 단어를 삭제
				wordList.remove(randIdx);
			}
			
			// 일치하지 않으면 해당 단어가 삭제되지 않고 또 입력 받음
			
			
			// 위 과정을 반복(wordList.size()가 0이 될때까지)
			if(wordList.size() == 0) {
				break;
			}
		}
		
		
		long after = System.currentTimeMillis();
		
		// after에서 before를 빼면, 타자를 친 시간이 구해진다.
		long diff = after - before; // diff는 밀리초 단위
		
		// 초 단위로 변환
		// 31872밀리초 -> 31.872초 
		double result = diff / 1000.0; //31.0 초
		System.out.println(result + " 초 걸리셨습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
