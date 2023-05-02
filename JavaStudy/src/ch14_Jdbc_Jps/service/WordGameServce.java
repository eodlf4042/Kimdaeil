package ch14_Jdbc_Jps.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_Jdbc_Jps.context.ConnectionPool;
import ch14_Jdbc_Jps.dao.WordGameDao;
import ch14_Jdbc_Jps.vo.StudentVo;
import ch14_Jdbc_Jps.vo.WordGameVo;

public class WordGameServce {
	
	private WordGameServce() {}
	
	private static WordGameServce instance = new WordGameServce();
	
	public static WordGameServce getInstance() {
		return instance;
	}
	
	private WordGameDao dao = WordGameDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	
	public ArrayList<WordGameVo> getWordList() {
		Connection conn = cp.getConnection();
		ArrayList<WordGameVo> result = new ArrayList<>();
		
		
		try {
			result = dao.getWordList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}

		 return result;
	}
	
}
