package kimdaeil.kimdaeil0419;

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
	
	// 게시글 추가
	public void addBoard(Board board) {
		boardList.add(board);
	}
	
	// 게시글 목록 출력
	public void showBoardList() {
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
	
	
	//조회
	public void selectBoard(int no) {
		// boardList에 존재하는 board 객체 중에
		// 파라미터로 들어온 no와 같은 no를 가지는 board 객체 찾기
		for(int i = 0; i < boardList.size(); i++) {
			Board bo = boardList.get(i);
			if(bo.getNo() == no) {
				System.out.println("제목: " + bo.getTitle() + bo.getBoardday());
				System.out.println("========================================");
				System.out.println(bo.getContent());
				
				return;
			}
		}
		
		System.out.println("존재하지 않는 글번호입니다.");
	}




}
