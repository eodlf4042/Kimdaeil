package kimdaeil.test01.kim0406;

import java.util.ArrayList;
import java.util.Collections;

import ch09_class.nextit.NextStudent;
import ch09_class.school.Student;

public class Kimdaeil0406 {

	public static void main(String[] args) {
/*
		Q. 01
		1.
		하이마트에 놀러갔더니 전자제품들이 정말 많이 있군요. 전자제품들은 각각 제품명과 가격이 함께 전시되어있습니다. 이를 코드로 구현하기 위해, 필드 변수에 제품명과 가격을 포함하는 전자제품 클래스(Product)를 만들어보세요.
		(당연히 제품명과 가격을 입력받는 생성자를 포함하며, 필드 변수들은 캡슐화를 해야 겠죠?)

		2.
		Product 클래스를 이용하여

		제품명: 냉장고, 가격: 2000000
		제품명: TV, 가격: 1000000
		제품명: 에어컨, 가격: 800000
		제품명: 컴퓨터, 가격: 1300000
		제품명: 선풍기, 가격: 100000

		객체들을 만들어주세요.

		3.
		전자제품들을 ArrayList 객체에 담은 후 가격별로 정렬하여 출력해주세요.

			

		4.
		정렬이 완료된 리스트에서 TV가 몇번째 인덱스인지 찾아내어 출력하시오.
		(ArrayList를 순회하면서 담겨져 있는 객체의 name이 TV인 경우 그때의 인덱스를 출력)
*/
		System.out.println("\n=================================1번====================================\n");
		//1
		
		//2
		Product refrigerator = new Product("냉장고",2000000);
		Product tv = new Product("tv  ",1000000);
		Product Airconditioner = new Product("에어컨",800000);
		Product Computer = new Product("컴퓨터",1300000);
		Product anelectricfan = new Product("선풍기",100000);
		
		//3
		ArrayList<Product> productList = new ArrayList<>();
		
		productList.add(tv);
		productList.add(Airconditioner);
		productList.add(Computer);
		productList.add(anelectricfan);
		productList.add(refrigerator);
		
		
		Collections.sort(productList, 
				(prodA, prodB) -> prodA.getProduct() - prodB.getProduct());
		
		for(int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		// indexOf()
		//4
		System.out.println("\n===indexOf====\n");
		int index = productList.indexOf(tv);
		System.out.println(index);
		
//		for(int i = 0; i< productList.size(); i++) {
//			if(productList.get(i).getName().equals("tv")) {
//				System.out.println(i);
//			}
//		}
//		
		
		
		
		
		
		
		

	}

}
