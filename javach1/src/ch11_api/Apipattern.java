package ch11_api;

import java.util.regex.Pattern;

import com.sun.scenario.effect.Bloom;

public class Apipattern {

	public static void main(String[] args) {
		// 정규표현식 (Regular Expression)
		// 특정한 규칙을 가진 문자열의 집합을 
		// 표현하기 위해 쓰는 형식
		
		// 전화번호, (3자리-4자리-4자리), (전부 숫자)
		// 주민등록번호 (6자리-7자리), (전부숫자)
		// 이메일 (영어와 숫자로 이루어진 문자열 @ 영어.영어)
		// 위와 같이 정해진 형식에 대해 정규표현식과
		// pattern 을 이용하여 검증할 수 있다.
		
		// 숫자만 존재하지 검증 (Validation)
		String example = "137657863";
		// 문자열의 시작과(^) 끝($) 사이에 숫자 ([0-9])가 1개 이상인지+ 체크 
		String regex =  "^[0-9]+$"; 
		
		// Pattern.matches를 하면 검증 결과가 true/false로 리턴
		boolean result = Pattern.matches(regex, example);
		System.out.println(result);
		
		// 문자열에 .matches(regex) 해도 된다.
		result = example.matches(regex);
		System.out.println(result);
		
		// 숫자만 존재하는지 검증 2
		// [0-9] = \\d
		regex = "\\d+";
		result = example.matches(regex);
		System.out.println(result);
		
		
		System.out.println("\n=======================알파벳 검===================================\n");
		
		// 알파벳만 존재하는지 검증
		example = "JeongChanung";
		regex = "[a-zA-Z]+";
		result = example.matches(regex);
		System.out.println(result);
		
		// 띄어쓰기를 포함시키기
		// 띄어쓰기 = \\s
		example = "Jeong Chanung";
		regex = "[a-zA-Z\\s]+";
		result = example.matches(regex);
		System.out.println(result);
		
		
		
		System.out.println("\n=========================한글 검증=================================\n");
		
		// 한글만 존재하는지 검증
		example = "찬웅ㄱㄱㅏㅑ";
		regex = "[가-힣ㄱ-ㅎㅏ-ㅣ]+";
		result = example.matches(regex);
		System.out.println(result);
		
		
		System.out.println("\n======================비밀번호 패턴================================\n");
		
		// 6자리 숫자 like pin 번호
		// (n) n자리숫자만  (n,m) n-m자리까지호용 
		example = "632";
		regex = "[0-9]{6}";
		result = example.matches(regex);
		System.out.println(result);
		
		// 같은 숫자 3회 이상 반복 금지
		example = "1211334553";
		regex = "[0-9]{6}";
		result = example.matches(regex);
		System.out.println(result);
		if(result) {
			regex = ".*([0-9]).*\\1.*\\1.*";
			result = example.matches(regex);
			System.out.println(result);
		}
		
		
		// 영어와 숫자로만 구성
		example = "1q2w3e4";
		regex = "[0-9a-zA-Z]+";
		regex = "\\w+";
		result = example.matches(regex);
		System.out.println("영어와 숫자로만 구성" +result);
		
		
		// 영어 소문자, 대문자 , 숫자, 특수문자 각각 1자리이상
		// 8자리 ~ 12자리로 설정해주세요!!
		example = "sfe143ES!#";
		
		// 알파벳 소문자가 1자리 이상이면 true
		regex = ".*[a-z].*";
		
		regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%#*?&]{8,12}$";
		result = example.matches(regex);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
