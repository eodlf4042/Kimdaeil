package ch14_Jdbc_Jps.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ch14_Jdbc_Jps.vo.WordGameVo;

public class WordGameDao {
	
	private WordGameDao() {}
	
	private static WordGameDao instance = new WordGameDao();
	
	public static WordGameDao getInstance() {
		return instance;
	}
	
	
	//단어 목록 가져오기
	public ArrayList<WordGameVo> getWordList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT						");
		query.append("				words			");
		query.append("FROM						   ");
		query.append("				wordgame		");
		
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<WordGameVo> result = new ArrayList<>();
		
		
		while(rs.next()) {
			WordGameVo temp = new WordGameVo();
			temp.setWords(rs.getString("words"));
			 result.add(temp);

		}
		
		rs.close();
		ps.close();
		
		return result;
		
		
		
		
		
		
		
	}
	
	
}
