package kimdaeil;

import java.util.Random;

public class Kimdaeil0331 {

	public static void main(String[] args) {

		
		System.out.println("\n=============================1번==================================\n");
		/*Q. 01
		한국 배우들의 명단을 배열로 만들어보았습니다.
		for문을 이용하여 "이"씨 성을 가진 사람이 몇명인지 출력해주세요.
		String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열"
		, "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", 
		"권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};
		 */
		String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", 
				"마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", 
				"소지섭", "공효진", "조정석", "허성태", "이하늬"};
		

		 int count = 0;
			
		  for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].substring(0,1).equals("이")) { 
				count++;
			}
		}
		  System.out.println("이씨 성을 가진 배우가 총 " + count + "명 있습니다.");
		
		  System.out.println("\n=============================2번==================================\n");
		  
		
		
		  /*Q. 02
		  최댓값, 최솟값 구하기

		  int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		  for문을 이용해 intArr의 최댓값과 최솟값을 출력해주세요.
		  Hint
		  for문 바깥에 int 변수 하나 선언해둔 뒤, for문을 돌리면서 각각의 요소가 int 변수보다 큰지 비교
		   크다면 int 변수에 해당 요소의 값 저장
		   */
		  
		  int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		  int max = intArr[0]; 
			for (int i = 0; i < intArr.length; i++) {
				 if (intArr[i] > max) {
					 max = intArr[i];
				 }
			}
			System.out.println("최대값 : " + max);
		
		
			int min = intArr[0]; 
			for (int i = 0; i > intArr.length; i++) {
				 if (intArr[i] > max) {
					 max = intArr[i];
				 }
			}
			System.out.println("최소값 : " + min);
		
		
		
			  System.out.println("\n=============================3번==================================\n");
		/*
		Q. 03

		로또 번호 생성기

		1~45 까지의 랜덤 숫자 6개를 배열에 중복되지 않도록 담고, 이를 정렬한 배열을 리턴하는 makeLotto() 함수를 만들어주세요.
		*/

		
		int[] myLotto = makeLotto();
		for(int i = 0; i< myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
			  
		
	}

//3번 로또 메소드

public static int[] makeLotto() {

	
	int[] lotto = new int[6];
	Random random = new Random();
	
	//번호 랜덤 생성
	for (int i = 0; i < lotto.length; i++) {
		lotto[i] = random.nextInt(45) + 1; 
	
	//중복값 제거
		for(int j = 0; j < i; j++) {
			if(lotto[i] == lotto[j]) {
				i--;
				break;
			} 
		}
	} 
	return lotto;

}













}







