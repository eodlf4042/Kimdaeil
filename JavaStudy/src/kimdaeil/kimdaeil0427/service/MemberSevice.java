package kimdaeil.kimdaeil0427.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_Jdbc_Jps.context.ConnectionPool;
import kimdaeil.kimdaeil0427.dao.MemberDao;

import kimdaeil.kimdaeil0427.vo.MemberVo;


public class MemberSevice {
	
	private MemberSevice() {}
	
	private static MemberSevice instance = new MemberSevice();
	
	public static MemberSevice getInstance() {
		return instance;
	}
	private MemberDao dao = MemberDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	// 회원목록을 조회(SELECT)하는 메소드
	public ArrayList<MemberVo> getMemList(){
		Connection conn = cp.getConnection();
		ArrayList<MemberVo> result = new ArrayList<>();
		
		try {
			result = dao.getmemList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		return result;
	}
	
	// 학생 회원가입 메소드
	public void regisMember(MemberVo member) {
		Connection conn = cp.getConnection();
		
		try {
			dao.regisMember(conn, member);
			System.out.println("회원가입에 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
	}
	
	public MemberVo login(MemberVo member) {
		Connection conn = cp.getConnection();
		MemberVo result = new MemberVo();
		
		try {
			result = dao.login(conn, member);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
