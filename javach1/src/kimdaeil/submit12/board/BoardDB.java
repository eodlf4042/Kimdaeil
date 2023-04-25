package chanung.submit12.board;

import java.util.ArrayList;

public class BoardDB {

	private ArrayList<Board> boardList = new ArrayList<>();
	
	private BoardDB() {
		
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	public int makeNumber() {
		return boardList.size()+1;
	}
	
	public void addBoard(Board board) {
		boardList.add(board);
	}
	
	public void showBoardList() {
		for(Board board : boardList) {
			System.out.println(board);
		}
	}
	
	
	
}
