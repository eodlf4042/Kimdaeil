package kimdaeil;

public class Kimdaeil0327 {

	public static void main(String[] args) {

	
/*
팩토리얼 다들 기억하시나요?
수학기호로 4! 는 4 팩토리얼을 의미하며, 1x2x3x4x5x6x7x8x9x10
그 값은 4x3x2x1 = 24 입니다.
for문을 사용해서 10팩토리얼의 값을 출력해주세요.
Hint
LoopFor 에서 실습해본 1부터 n까지 더하는 코드를 응용해보세요
결과: 3628800
@ 15 팩토리얼의 값을 출력해주세요.
결과: 1307674368000

 */System.out.println("\n=====================1번========================\n");
		int sum = 1;
		
		for (int i = 1; i <= 10; i++) { 
			
			sum *= i;
		}
		System.out.println(sum);
		
		System.out.println("\n=====================심화1번========================\n");
		//int가 담을수 없어서 long를 씀
		long sum1 = 1;
		for (int i = 1; i <= 15; i++) { 
			
			sum1 *= i;
		}
		System.out.println(sum1);
	
	

/*
Q. 02

월리를 찾아라!!

아래의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력해주세요.

String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";


Hint
수업시간에 해보았던 "슈"는 문자열을 한글자씩 잘라서 "슈"가 맞는지 비교하였다면,
이번에는 두글자씩 잘라서 "월리"가 맞는지 비교하시면 됩니다.


결과: 5

 */
		System.out.println("\n=====================2번========================\n");
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

		
		  int count2 = 0;
	
		  for (int i = 0; i < findWally.length()-1; i++) {
			
			  String str = findWally.substring(i, i+2);
			if (str.equals("월리")) { 
				count2++;
			}
		}
		  System.out.println("월리의 갯수:" + count2);
		
		
		
		  
		
		
/*Q. 03 거꾸로 트리를 5층 만들어주세요.


String stars = "*****";

for문을 5번 반복하면서 stars를 아래와 같이 나오도록 잘라서 출력해보세요


Hint
for문 내에서 .substring() 사용

 */

	System.out.println("\n=====================3번========================\n");
		
		String stars = "*****";
		
		//i가 0, 1, 2, 3, 4
		//stars는 5, 4, 3, 2, 1
		//stars.substring(???) 의 결과 5, 4, 3, 2, 1개
		for (int i = 0;  i < 5;  i++) {
			System.out.println(stars.substring(i));	
		}
	
		
		
		
		
		
		
	
	}
	
}
