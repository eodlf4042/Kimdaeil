package ch14_Jdbc_Jps.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_Jdbc_Jps.context.ConnectionPool;
import ch14_Jdbc_Jps.dao.StudentDAO;
import ch14_Jdbc_Jps.vo.StudentVo;

public class StudentService {
	
	private StudentService() {}
	
	private static StudentService instance = new StudentService();
	
	public static StudentService getInstance() {
		return instance;
	}
	
	
	private StudentDAO dao = StudentDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	
	// 회원목록을 조회(SELECT)하는 메소드
	
	public ArrayList<StudentVo> getStuList(){
		Connection  conn = cp.getConnection();
		ArrayList<StudentVo> result = new ArrayList<>();
		
		
		try {
			result = dao.getStuList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
	// 학생 회원가입 (INSERT) 메소드
	public void regisStudent(String id, String pw, String name) {
		Connection conn = cp.getConnection();
		
		
		
		
		try {
			dao.regisStudent(conn, id, pw, name);
			System.out.println("회원가입에 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
	}
	
	
	// 학생 회원가입 (INSERT) 메소드
	public void regisStudent(StudentVo student) {
		Connection conn = cp.getConnection();
		
		try {
			dao.regisStudent(conn, student);
			System.out.println("회원가입에 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
	}
	
	
	// 로그인 (SELECT) 메소드
	public StudentVo login(StudentVo student) {
		Connection conn = cp.getConnection();
		StudentVo result = new StudentVo();
		
		try {
			result = dao.login(conn, student);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		
		return result;
		
	}
	
	
	
	
	
	
}
