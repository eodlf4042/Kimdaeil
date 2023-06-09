package ch10_Extends_in.starcraft;

import java.util.ArrayList;

public class StarCraftMain {

	public static void main(String[] args) {
		
		Marine marine = new Marine("마린", 6, 50, 0);
		System.out.println(marine);
		
		marine.move(100, 200);
		marine.stimpack();
		System.out.println(marine);
		
		
		Marine marine2 = new Marine();
		System.out.println(marine2);
		
		
		Zealot zealot = new Zealot();
		System.out.println(zealot);
		
		zealot.move(10, 5);
		
		
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		
		
		// 질럿을 드래그로 선택 후 한번에 이동명령 내리기
		ArrayList<Zealot> protossList  = new ArrayList<>();
		
		protossList.add(zealot);
		protossList.add(zealot2);	
		protossList.add(zealot3);
		protossList.add(zealot4);
		protossList.add(zealot5);
		protossList.add(zealot6);
		
		for(int i = 0; i<protossList.size(); i++) {
			protossList.get(i).move(50, 70);
		}
		
		
		
		HighTemplat highTemplar = new HighTemplat();
		System.out.println(highTemplar);
		
		
		highTemplar.tthunderStorm();
		
		// 하이템플러도 같이 드래그해서 이동시코 싶으나
		//ArrayList<Zeaolot>에 담기지 않는다.
//		 protossList.add(highTemplar);
		
		// 다형성(Polymorphism)
		// 하나의 객체가 여러 탕비을 가질 수 있는 것
		// 자식객체에서 부모객체로 형변환이 가능 하다.
		StarUnit highTemplar2 = new HighTemplat();
		// 자식에서 부모로의  형변환은 자동 형변환이 된다.
		StarUnit highTemplar1 = highTemplar;
		
		Object obj = highTemplar2;
		Object temp = new Zealot();
		
		ArrayList<StarUnit> starList = new ArrayList<>();
		
		// starList는 StarUnit의 자식 객체들을 다 담을 수 있다.
		// 담기면서 자동형변환이 되어 담김
		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(highTemplar1);
		starList.add(highTemplar2);
		starList.add(marine);
		
		
		for(int i = 0; i<starList.size(); i++) {
			
			starList.get(i).move(100, 1500);
		}
		
		marine.attack(zealot6);;
		System.out.println(zealot6);
		
		marine.attack(highTemplar);
		System.out.println(highTemplar);
		
		zealot.attack(marine2);
		System.out.println(marine2);
		
		
		System.out.println("\n========================================================\n");
		
		
		// highTemplar (자식) 이 StarUnit (부모) 로
		// 형변환이 되어있기 때문에
		// 부모가 가지고 있지 않은 메소드는 사용 불가
//		starList.get(4).tthunderStorm();
		
		
		// 자식 --> 부모 상태인 객체를 
		// 부모 --> 자식 형변환 한 후 자식의 메소드 사용
		// 부모 --> 자식은 자동 형변환 안됨
		HighTemplat welcome = (HighTemplat) starList.get(4);
		welcome.tthunderStorm();
		
		((HighTemplat) starList.get(4)).tthunderStorm();
		
		//for문을 돌려서 이 객체가 월래는 하이템플러였다면
		// 썬더스톰을 쓰도록 하기
		
		// 하이템플러가 --> 스타유닛 --> 하이템플러(O)
		// 하이템플러가 --> 스타유닛 --> 질럿, 마린(X)
//		((HighTemplat)starList.get(0)).move(5, 5);
		
		
		for(int i = 0; i < starList.size(); i++) {
		//1.equals
			if(starList.get(i).getName().equals("하이템플러")) {
				((HighTemplat)starList.get(i)).tthunderStorm();
			}

		// 객체 instanceof 클레스
		// 좌측의 객체가 우측의 클래스로 형변환이 
		// 가능하다면 true, 블가능하면 false 리턴
		
		//2. instanceof
		if(starList.get(i) instanceof HighTemplat){
			((HighTemplat)starList.get(i)).tthunderStorm();
		 	}
		 
		
		// 마린이면 stimpack() 쓰기
		//1.instanceof
		if(starList.get(i).getName().equals("마린")) {
			((Marine)starList.get(i)).stimpack();
			}
		//2.equals
		if(starList.get(i) instanceof Marine){
			((Marine)starList.get(i)).stimpack();
			}
		}
		
		// 부모 각체
		StarUnit scv = new StarUnit("SCV", 5 , 60, 0);
		
		//일반적으로 부모 객체는 자식 객체로 형변환할 수 없다.
		System.out.println(scv instanceof Zealot);
		
		// 자식객체는 부모 객체로 형변환이 가능하다.
		System.out.println(zealot instanceof StarUnit);
		
		// 부모 객체로 형변환 되었던 자식 객체는
		// 다시 자식 타입으로 형변환이 가능하다.
		System.out.println(starList.get(0) instanceof Zealot);
		
		
		
		
		
		
		
	}

}
