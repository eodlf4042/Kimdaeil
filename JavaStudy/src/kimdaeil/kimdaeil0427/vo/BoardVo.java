package kimdaeil.kimdaeil0427.vo;

import java.util.Date;

public class BoardVo {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardAuthor;
	private Date boardDate;
	private String memId;
	
	public BoardVo() {}
	
	public BoardVo(int boardNo, String boardTitle, String boardContent, String boardAuthor, Date boardDate) {
	    this.boardNo = boardNo;
	    this.boardTitle = boardTitle;
	    this.boardContent = boardContent;
	    this.boardAuthor = boardAuthor;
	    this.boardDate = boardDate;
	}

	
	@Override
	public String toString() {
		return "BoardVo [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardAuthor=" + boardAuthor + ", boardDate=" + boardDate + "]";
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardAuthor() {
		return boardAuthor;
	}

	public void setBoardAuthor(String boardAuthor) {
		this.boardAuthor = boardAuthor;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	
	
}

