package kimdaeil.kimdaeil0427.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import kimdaeil.kimdaeil0427.vo.BoardVo;
import kimdaeil.kimdaeil0427.vo.MemberVo;



public class BoardDao {private BoardDao() {}

private static BoardDao instance = new BoardDao();

public static BoardDao getInstance() {
	return instance;
}

// 보드테이블 출력
public ArrayList<BoardVo> getBoardList(Connection conn) throws SQLException {
	StringBuffer query = new StringBuffer();
	query.append("SELECT ");
	query.append("  board_no, ");
	query.append("  board_content, ");
	query.append("  board_title, ");
	query.append("  board_author, ");
	query.append("  board_date ");
	query.append("FROM ");
	query.append("  board ");
	query.append("ORDER BY board_no ASC");
	
	PreparedStatement ps = conn.prepareStatement(query.toString());
	
	// SELECT문의 경우 실행 결과를 ResultSet에 담는다.
	ResultSet rs = ps.executeQuery();
	
	ArrayList<BoardVo> result = new ArrayList<>();
	while(rs.next()) {
		int boardNo = rs.getInt("board_no");
		String boardContent = rs.getString("board_content");
		String boardTitle = rs.getString("board_title");
		String boardAuthor = rs.getString("board_author");
		Date boardDate = rs.getDate("board_date");
		
		BoardVo board = new BoardVo(boardNo, boardContent, boardTitle, boardAuthor, boardDate);
		
		result.add(board);
	}
	
	rs.close();
	ps.close();
	
	return result;
}

// 글쓰기
public BoardVo insertBoard(Connection conn, BoardVo board) throws SQLException {
	StringBuffer query = new StringBuffer();
	query.append("INSERT INTO board ");
	query.append("  (board_no, board_title, board_content, board_author, board_date) ");
	query.append("VALUES ");
	query.append("  ((SELECT MAX(board_no) FROM board) + 1, ?, ?, ?, sysdate) ");
	
	PreparedStatement ps = conn.prepareStatement(query.toString());
	int idx = 1;
	ps.setString(idx++, board.getBoardTitle());
	ps.setString(idx++, board.getBoardContent());
	ps.setString(idx++, board.getBoardAuthor());
	
	ps.executeUpdate();
	
	ps.close();
	return board;
}

// 글조회
public BoardVo getBoard(Connection conn, int boardNo) throws SQLException {
	StringBuffer query = new StringBuffer();
	query.append("SELECT ");
	query.append("  board_title, ");
	query.append("  board_content, ");
	query.append("  board_author, ");
	query.append("  board_date ");
	query.append("FROM ");
	query.append("  board ");
	query.append("WHERE board_no = ?");
	
	PreparedStatement ps = conn.prepareStatement(query.toString());
	ps.setInt(1, boardNo);
	
	ResultSet rs = ps.executeQuery();
	
	BoardVo board = null;
	if(rs.next()) {
		String boardTitle = rs.getString("board_title");
		String boardContent = rs.getString("board_content");
		String boardAuthor = rs.getString("board_author");
		Date boardDate = rs.getDate("board_date");
		
		board = new BoardVo(boardNo, boardContent, boardTitle, boardAuthor, boardDate);
	}
	
	rs.close();
	ps.close();
	
	return board;
}

}