package kimdaeil.test01;

import java.util.Scanner;

public class Kimdaeil0329 {

	public static void main(String[] args) {

/*for문을 배울때, 트리를 참 많이 만들었죠?
근데 항상 5층짜리 트리여서 아쉬웠을거에요.
		
n층 짜리 트리를 출력할 수 있는 makeTree(int n) 메소드를 만들어서 실행시켜 주세요
*/
		
		//1번
		System.out.println("\n=====================1번========================\n");

		makeTree(5);
		makeTree(7);
	
		
		System.out.println("\n=====================2번========================\n");

		
/*로꾸꺼를 메소드로 만들어서

파라미터로 들어온 String 문자열에 대해 뒤집은 결과를 리턴하는 메소드

String example = "로꾸꺼 로꾸꺼";
String result = reverseStr(example);
System.out.println(result);

*/
		
		//2번
		String example = "로꾸꺼 로꾸꺼 ";
		String result = reverseStr(example);
		System.out.println(result);
		
		
		
		System.out.println("\n=====================3번========================\n");

/*십진수를 이진수(String 타입)로 리턴해주는 makeBinary(int 타입) 함수를 만들어보세요.


Hint
문자열 변수를 하나 선언해서 
입력받은 정수를 2로 나눈 나머지를 문자열 변수에 더한다.
그 다음 입력받은 정수를 2로 나눈 몫을 이용하여 위 과정을 반복한다.
2로 나눈 몫이 1이 된다면 반복을 종료한다.
이진수로 만들어진 문자열 변수를 거꾸로(로꾸꺼) 뒤집은 다음 리턴한다
*/
		//3번
		
		
		String myBinaryStr = mareBinary(23);
		System.out.println(myBinaryStr);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	//main 메소드 아래
	
	//1.트리메소드
	public static void makeTree(int n) {
		for (int i = 0 ; i < n; i++) {
			for(int j = (n-1)-i ; j > 0 ; j--) {
				System.out.print(" ");
			}
			for(int k =(i*2)+1 ; k>0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	//2.로꾸꺼 메소드
	public static String reverseStr(String exa) {
		String result = "";
		for (int i = exa.length(); i >= 1; i--) {
			String str = exa.substring(i - 1, i);			
			result += str;
			
	
		}
     	return result;
	}
	
	
	
	
	// 이진법 메소드
	public static String mareBinary(int num) {
		// number에 17이 들어왔다.
		// 17을 2로 나눠서 나머지 1 / 몫은 8
		// 8을 2로 나눠서 나머지는 0 / 몫은 4
		// 4를 2로 나눠서 나머지는 0 / 몫은 0
		// 2를 2로 나눠서 나머지는 0 / 몫은 1 
		// 1을 2로 나눠서 나머지는 1 / 몫은 0(스탑)
		
		// 반복횟수와 기준이 애매하면 while(true)
		String result = "";
		while(num > 0) {
			result += num % 2;
			num = num / 2;
		}
		return reverseStr(result);
		
	
	}
	
	
	
	
	
	
}

	


