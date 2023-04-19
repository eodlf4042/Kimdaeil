package kimdaeil.test01;

public class Submit01 {

	public static void main(String[] args) {
		
		  System.out.println("1번");
		  
		  String name = "홍길동";
		  int age = 30;
		  double height = 177.9;
		  String phone = "010-7398-7332";
		  String email = "이메일: gildong@gmail.com";
		  
        System.out.println("이름 : " + name);
        
        
        System.out.println("나이 : " + age);
        
       
        System.out.println("키 : " + height);
        
        
        System.out.println("번호 : " + phone);
           
        
        System.out.println("이메일 : " + email);
       
        
        
        
        System.out.println("==============================");
        System.out.println("2번");
        
        String enigma = "너오구늘리뭐너먹구지리";
       
        enigma = enigma.replace("너", "");
        System.out.println("1차 암호 해독 [너제거] = "+ enigma);
         
        enigma = enigma.replace("구", "");
        System.out.println("2차 암호 해독 [구제거]= "+ enigma);
         
        enigma = enigma.replace("리", "");
        System.out.println("3차 암호 해독 [리제거]= "+ enigma);
        
        System.out.println("해독완료----> "+ enigma);
        System.out.println( enigma);
    	 System.out.println("==============================");
    	 
    	 System.out.println("3번");
        
      
    	 //0.03각자리수 더하기
    	 int example =278;
    	 // 숫자들 문자열로 변환
    	 String stEx =  example + "";

    	 
    	 // 문자열을 각 자리수마다 자른다.
    	 //substring
    	 String strl1 =stEx.substring(0, 1);
    	 String strl2= stEx.substring(1, 2);
    	 String strl3= stEx.substring(2, 3);
    	 
    	 
    	 int int1 = Integer.parseInt(strl1);
    	 int int2 = Integer.parseInt(strl2);
    	 int int3 = Integer.parseInt(strl3);
    	 
    	 int resul = int1 +  int2 + int3;
    	 System.out.println(resul);
	}

}
