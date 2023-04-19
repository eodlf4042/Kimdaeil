package kimdaeil;

import java.util.ArrayList;

public class submit07 {

	public static void main(String[] args) {
		// Q.01 
		//정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20 사이의 랜덤 숫자를 10개 담으시오. (10도 나오고 20도 나올 수 있어야 함)
		
		System.out.println("\n======================문제.1=================================\n");

		ArrayList<Integer> intList = new ArrayList<>();
		
		// 1~45 => (int)(Math.random() * 45) + 1; 
		// 15~30 => (int)(Math.random() * 16) + 15;
		// 0~10 => (int)(Math.random() * 11);
		// 10~20 => (int)(Math.random() * 11) + 10;

		
		for(int i = 0; i < 10; i++) {
			int rand = makeRandom(10, 20);
			intList.add(rand);
		}
		
		System.out.println(intList);
		
		
		//중복제거
		System.out.println("\n======================중복제거1=================================\n");
		ArrayList<Integer> newList = new ArrayList<>();
		
		
		for(int i = 0; i < intList.size(); i++) {
			
			if(!newList.contains(intList.get(i))) {
				newList.add(intList.get(i));
			}
			
		}
		System.out.println(newList);
		System.out.println("\n======================중복제거2=================================\n");
		
		// 중복 제거 두번쨰 방법
		for(int i = 0; i < intList.size(); i++) {
			for(int k = intList.size()-1; k > i; k--) {
				if(intList.get(i) == intList.get(k)){
					intList.remove(k);
				}
			}
		}
		System.out.println(intList);
		
		
		
		System.out.println("\n======================문제.2=================================\n");
		
		ArrayList<String> wipeList = new ArrayList<>();
		
		wipeList.add("냉장고");
		wipeList.add("로봇청소기");
		wipeList.add("세탁기");
		wipeList.add("에어컨");
		wipeList.add("건조기");

		ArrayList<String> husList = new ArrayList<>();
		
		wipeList.add("노트북");
		wipeList.add("로봇청소기");
		wipeList.add("TV");
		wipeList.add("에어컨");
		wipeList.add("플스");
		
		// 서로 사고 싶은 물건 목록
		ArrayList<String> wantBuy = new ArrayList<>();
		
		for(int i = 0; i < wipeList.size(); i++) {
			if(husList.contains(wipeList.get(i))) {
				wantBuy.add(wipeList.get(i));
			}
		}
		
		System.out.println(wantBuy);
		
		// 교집함을 위한 .retainAll()
		wantBuy.clear();
		wantBuy.addAll(wipeList); // 아내의 구매목록 전부 담기
		wantBuy.retainAll(husList);
		System.out.println(wantBuy);
		
		
		
		
		// 전체 구매 목록
		ArrayList<String> allBuy = new ArrayList<>();
		
		allBuy.addAll(wipeList);
		System.out.println(allBuy);
		
		for(int i = 0; i < husList.size(); i++) {
			
			if(!allBuy.contains(husList.get(i))) {
				allBuy.add(husList.get(i));
			}
		}
		System.out.println(allBuy);
		
		
		
		
		
		
		
		
	}// main 
	
	public static int makeRandom(int a, int b) {
		return (int)(Math.random() *b-a+1) + a;
	}
	
	
	
	
	
	
	
	
	
	
	
}