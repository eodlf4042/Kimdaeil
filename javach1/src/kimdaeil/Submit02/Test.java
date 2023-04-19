package kimdaeil.Submit02;

import java.util.Scanner;
import javax.swing.text.StyledEditorKit.BoldAction;
public class Test {

	public static void main(String[] args) {

//if
		
		
		
		//성적
		int score = 80;
		 String grade = "";
		 grade = "c";
		 if(score >= 90) {
			 grade = "A";
		 }else if(score >=80){
			 grade = "B";
		 }
		 System.out.println(grade);
		 System.out.println("\n=============================================\n");
		 
		 //회원가입
		 
		 String name = "김대일"; 
		 String phon = "01099796408";
		 int  age = 26;
		 
		 if(name.length() > 0){
			//통과
		 if(phon.length() == 10 || phon.length() == 11) {
			//통과
			if(age >= 14) {
				System.out.println("확인가능");
			}else {
				System.out.println("확인불가");
			}
				
		 }else {
			 System.out.println("확인불가");
		 }
		 }else {
			 System.out.println("확인불가");
		 }
//for 문
		 System.out.println("\n=============================================\n");
		// 1 ~ 10
	for(int i = 1; i<=10; i++) {
		System.out.println(i);
	}
	
	// 1부터 20까지 더하기
	System.out.println("\n=============================================\n");
	int sum = 0;
	for(int i = 1; i <= 20; i++) {
		sum += i;
	}
	System.out.println(sum);
	System.out.println("\n=============================================\n");
	// 21부터 45까지 더한값
	for(int i = 21; i<=45; i++) {
		sum += i;
	}
	System.out.println(sum);
	// 1부터 40까지 중에서 짝수끼리만 더한값
	System.out.println("\n=============================================\n");
	int sum1 = 0;
	
	for(int i = 1; i<= 40; i++) {
		if(i % 2 ==0){
			sum1 += i; 
		}
	}
	System.out.println(sum1);
	
	// 국룰
			sum = 0;
			for (int i = 0; i <= 40; i += 2) {
				sum += i;
			}
			System.out.println(sum);
			System.out.println("\n=============================================\n");
	
	// 0부터 2까지 0.2마다 출력
			for (double i = 0; i <= 2; i += 0.2) {
				System.out.println(i);
			}

			for (int i = 0; i <= 20; i += 2) {
				System.out.println(i / 10.0);
			}
	
			for (int i = 0; i < 11; i++) {

				System.out.println(i * 2 / 10.0);

			}
			System.out.println("\n=============================================\n");
			for (int i = 2; i <= 9; i++) {

				System.out.println("2 x " + i + " = " + i * 2);

			}
	
			String star = "*";
			for (int i = 0; i < 5; i++) {
				star += "*";
				System.out.println(star);
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
