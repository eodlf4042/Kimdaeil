package kimdaeil.kimdaeil00414;

import java.util.ArrayList;



public class ComplaintsDB {
private ArrayList<Complaints> complaintsList = new ArrayList<>();
	
	// 싱글톤 적용
	// 프로젝트 내에서 이 클래스로부터 객체를 딱 하나만
	// 생성할 목적으로 사용
	private ComplaintsDB() {
		complaintsList.add(new Complaints(1, "고객님", "죄송합니다", "죄송합니다"));
	}
	
	private static ComplaintsDB instance = new ComplaintsDB();
	
	public static ComplaintsDB getInstance() {
		return instance;
	}
	
	
	// 게시글 목록 출력
	public void showComplaintsList() {
		for(int i = 0; i < complaintsList.size(); i++) {
			System.out.println(complaintsList.get(i));
		}
	}
	
	// 게시글 추가
	public void addComplaints(Complaints complaints) {
	
		complaints.setNo(complaintsList.size() + 1);
		
		complaintsList.add(complaints);
	}
	
	public void selectComplaints(int no) {
	
		for(int i = 0; i < complaintsList.size(); i++) {
			Complaints bo = complaintsList.get(i);
			if(bo.getNo() == no) {
				System.out.println("민원 제목: " + bo.getTitle());
				System.out.println("고객님 : " + bo.getAuthor());
				System.out.println("========================================");
				System.out.println("민원 내용: " + bo.getContent());
				
				return;
			}
		}
		
		System.out.println("존재하지 않는 민번호입니다.");
	}
	
	
	
}
