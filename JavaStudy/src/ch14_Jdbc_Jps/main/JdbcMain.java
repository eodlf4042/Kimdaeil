package ch14_Jdbc_Jps.main;

import java.util.ArrayList;
import java.util.Scanner;
import javax.smartcardio.CommandAPDU;
import ch14_Jdbc_Jps.service.StudentService;
import ch14_Jdbc_Jps.vo.StudentVo;

public class JdbcMain {

	public static void main(String[] args) {
		
		
		StudentService stuService = StudentService.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("행동을 선택해주세요!");
			System.out.println("1.로그인 | 2.회원가입 | 3.회원목록 | 4.종료");
			System.out.print(">>>>>");
			
			int command = 0;
			try {
				 command = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요!!!");
				continue;
			}
			if(command == 1) {
				// TODO 로그인
				System.out.print("아이디 : ");
				String id = scan.nextLine();
						
				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();
				
				StudentVo student = new StudentVo();
				student.setStuId(id);
				student.setStuPassword(pw);
				
				StudentVo login = stuService.login(student);
				
				if(login.getStuId() != null) {
					// 로그인 성공
					System.out.println(login.getStuName() +"님 환영합니다.");
				}else {
					// 로그인실패
					System.out.println("아이디 혹은 비밀번호가 틀립니다.");
				}
				
			}else if(command == 2) {
				// TODO 회원가입
				System.out.print("아이디 : ");
				String id = scan.nextLine();
						
				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();
				
				System.out.print("닉네임 : ");
				String name = scan.nextLine();
				
//				stuService.regisStudent(id, pw, name);
				
				StudentVo stu = new StudentVo(id, pw, name, 0);
				stuService.regisStudent(stu);
				
				
				
				
				
				
			}else if(command == 3) {
				// TODO 회원목록 조회
				ArrayList<StudentVo> stuList = stuService.getStuList();
				for(int i = 0; i <stuList.size(); i++) {
					System.out.println(stuList.get(i));
				}
			}else if(command == 4) {
				//  종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요!");
			}
			
			
			
			
			
			
			
		}
		
		
		
	}

}
