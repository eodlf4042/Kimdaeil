package kimdaeil.kimdaeil0427.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_Jdbc_Jps.dao.StudentDAO;
import ch14_Jdbc_Jps.vo.StudentVo;
import kimdaeil.kimdaeil0427.vo.MemberVo;

public class MemberDao {
	
private MemberDao() {}
	
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getInstance() {
		return instance;
	}
	public ArrayList<MemberVo> getmemList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT							");
		query.append("		 mem_id					");
		query.append("		,mem_password	AS pw	");
		query.append("FROM								");
		query.append("			members				");  // 세미콜론이 없음에 주의
		
		// 객체(PreparedStatement) 생성
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		// SELECT문의 경우 실행 결과를 ResultSet에 담는다.
		ResultSet rs = ps.executeQuery();
		
		// 6.ResultSet에 담긴 데이터 조회
		// StudentVO 객체를 만들어서 리스트에 담아 리턴
		ArrayList<MemberVo> result = new ArrayList<>();
		
		while(rs.next()) {
			// 쿼리문 실행 결과에 해당하는 컬러명과 일치해야 함
			String memId = rs.getString("mem_id");
			String memPw = rs.getString("pw");
			
			MemberVo mem = new MemberVo(memId,memPw);
			
			result.add(mem);
			
			
		
	
	}
		ps.close();
		rs.close();
		
		return result;
		
	}

	
	
	// 학생 회원가입(INSERT) 메소드
		public int regisMember(Connection conn, MemberVo member) throws SQLException {
			
			
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO members(");
			query.append("		 mem_id			");
			query.append("		,mem_password	");
			query.append("		)  VALUES(		");
			query.append("	 		  ?				");
			query.append("	 	   , ?				");
			query.append("	 )						");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			int  idx = 1;
			ps.setString(idx++, member.getMemId());
			ps.setString(idx++, member.getMemPassword());
	
			
			int cnt = ps.executeUpdate();
			
			ps.close();
			
			return cnt;
		}
		// 로그인 (SELECT) 메소드
		// 입력받은 아이디와 비밀번호가 일치하는 하나의 데이터 리턴
		public MemberVo login(Connection conn, MemberVo member) throws SQLException {
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT							");
			query.append("		 mem_id					");
			query.append("		,mem_password	AS pw	");
			query.append("FROM								");
			query.append("			members				");
			query.append("WHERE 1=1						");
			query.append(" AND 	mem_id = ?				");
			query.append(" AND 	mem_password = ?		"); 
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			int idx = 1;
			ps.setString(idx++, member.getMemId());
			ps.setString(idx++, member.getMemPassword());
			
			ResultSet rs = ps.executeQuery();
			
			MemberVo result = new MemberVo();
			// rs에 데이터가 1개 담겨있으면 while문 한번만 실행된다.
			while(rs.next()) {
				
				result.setMemId(rs.getString("mem_id"));
				result.setMemPassword(rs.getString("pw"));
			}
			
			rs.close();
			ps.close();
			
			return result;
			
			
			
			
		}
	
	
	
	
	}
