package kimdaeil.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.omg.CORBA.MARSHAL;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

public class Kimdaeil0404 {

	public static void main(String[] args) {


		/*makeLotto를 ArrayList와 HashSet을 이용해서 만들어보세요
		
		
		Hint
		먼저 빈 HashSet을 하나 만들고, while문 내에서 빈 HashSet에 랜덤 로또 번호를 HashSet의 사이즈가 6개가 될 때까지 넣는다.
		이후 HashSet을 ArrayList로 변환한 다음, 오름차순으로 ArrayList를 정렬하여 리턴한다
*/
		System.out.println("\n====================1번=====================\n");

		
		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);
		
		
		
		
		
		
		
		/*infoMap의 Key는 사용자의 아이디, Value는 사용자의 비밀번호라고 했을 때 아래와 같이 데이터를 추가해주세요.
		
		사용자가 아이디와 비밀번호를 파라미터로 넣었을때, 
		infoMap의 Key(아이디)와 Value(비밀번호)와 비교하여

		아이디와 비밀번호가 infoMap 내에 존재하는 데이터와 일치하면 로그인 성공 출력
		아이디가 존재하지 않으면, 존재하지 않는 아이디입니다. 출력 
		아이디는 존재하지만 비밀번호가 일치하지 않으면 비밀번호가 틀렸습니다. 출력

		
		
		 */
		System.out.println("\n====================2번=====================\n");
		
		
		HashMap<String, String> infoMap = new HashMap<>();
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		System.out.println(infoMap);
		
		//스캔입력
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		System.out.print(">>> ");
		String ID = scan.nextLine();
		
		System.out.println("비밀번호를 입력해주세요");
		System.out.print(">>> ");
		String PW = scan.nextLine();
	
		
		//입력한 id가 key값 중에 존재하면 null이 아님, 없으면 null 리턴
		if(infoMap.get(ID) != null) {
			// id가 map안에 key값으로 존재
		
			// TODO 비밀번호 체크
			
			if(infoMap.get(ID).equals(PW)){
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			// id가 map안에 key값으로 존재하지 않음
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	} //메인 메소드 /* 
	//로또 메소드
	public static ArrayList<Integer> makeLotto(){
	 HashSet<Integer> lottoSet = new HashSet<>();
	
	while(lottoSet.size() < 6) {
		// 렌덤 로또 번호를 lottoSet에 사이즈가 6이될때까지
		// 담는다.
		int rand = (int)(Math.random()*45) +1;
		
		lottoSet.add(rand);
		
		//if(lottoSet.size() == 6) {
			//break;
		//}
		}
		// set의 값들을 ArrayList에 옮긴다.
	ArrayList<Integer> result = new ArrayList<>();
	for(Integer num : lottoSet) {
		result.add(num);
	}
	
	// 정렬
	Collections.sort(result);
	
	return result;
}
	
	
	
	
	
	
	
}
