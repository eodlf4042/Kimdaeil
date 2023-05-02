package kimdaeil.kimdaeil0427.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_Jdbc_Jps.context.ConnectionPool;
import kimdaeil.kimdaeil0427.dao.BoardDao;
import kimdaeil.kimdaeil0427.vo.BoardVo;
import kimdaeil.kimdaeil0427.vo.MemberVo;

public class BoardService {
	  private BoardService() {}
	    
	    private static BoardService instance = new BoardService();
	    
	    public static BoardService getInstance() {
	        return instance;
	    }
	    
	    private BoardDao dao = BoardDao.getInstance();
	    private ConnectionPool cp = ConnectionPool.getInstance();
	    
	 // 게시글 목록을 조회(SELECT)하는 메소드
	    public ArrayList<BoardVo> getBoardList() {
	    	Connection conn = cp.getConnection();
	    	ArrayList<BoardVo> result = new ArrayList<>();

	    	try {
	    		result = dao.getBoardList(conn);
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	} finally {
	    		cp.releaseConnection(conn);
	    	}
	    	return result;
	    }

	    // 게시글 상세보기 메소드
	    public BoardVo getBoard(int board) {
	    	Connection conn = cp.getConnection();
	    	BoardVo result = new BoardVo();

	    	try {
	    		result = dao.getBoard(conn, board);
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	} finally {
	    		cp.releaseConnection(conn);
	    	}

	    	return result;
	    }

	    // 게시글 등록 메소드
	    public ArrayList<BoardVo> getBoardsList(BoardVo board) {
	    	Connection conn = cp.getConnection();
	    	ArrayList<BoardVo> result = new ArrayList<>();
	    	try {
	    		result = dao.getBoardList(conn);
	    		System.out.println("게시글 등록에 성공하였습니다.");
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	} finally {
	    		cp.releaseConnection(conn);
	    	}
	    	return result;
	    }

	    
	    
	    
	}

