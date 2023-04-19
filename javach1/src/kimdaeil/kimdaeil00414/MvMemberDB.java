package kimdaeil.kimdaeil00414;

import java.util.ArrayList;



public class MvMemberDB {
private ArrayList<MvMember> memList = new ArrayList<>();

MvMemberDB() {
	// 기본 생성자에 실행구문 추가
	memList.add(new MvMember("a001", "123a", "대일"));
	memList.add(new MvMember("b001", "123b", "대이"));
	memList.add(new MvMember("c001", "123c", "대삼"));
}

// 2. 필드변수에 자기자신 객체를 소환한다.
// static을 붙여주어야 다른 클래스에서
// 이 객체를 소환하지 않고 접근할 수 있다.
// 접근 후 직접적으로 수정할 수 없게 private 처리
// 싱글톤 패턴 적용
// 1. 기본 생성자의 접근 제어자를 private 으로 막는다.
private static MvMemberDB instance = new MvMemberDB();

// 3. instance에 대한 Getter 생성
public static MvMemberDB getInstance() {
	return instance;
}



// 회원 목록 조회
public void showMvMemList() {
	for(int i = 0; i < memList.size(); i++) {
		System.out.println(memList.get(i));
	}
}


// 회원가입 
public void registMvMember(MvMember mem) {
	// 파라미터로 들어온 mem 객체에 대해
	// mem.getId() 가 memList.get(i).getId() 와 같은게
	// 있다면 아이디가 중복되므로 회원가입 안시켜줌
	for(int i = 0; i < memList.size(); i++) {
		if(mem.getId().equals(memList.get(i).getId())) {
			System.out.println("중복된 아이디 입니다.");
			return;
		}
	}
	
	memList.add(mem);
}

//로그인
public MvMember login(String id, String pw) {
	for(int i = 0; i < memList.size(); i++) {
		if(memList.get(i).getId().equals(id) 
				&& memList.get(i).getPassword().equals(pw)) {
			
			return memList.get(i);
		}
	}
	
	return null;
}


	
	
	
}
