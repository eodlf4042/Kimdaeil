package kimdaeil.kimdaeil0419;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

public class Board {
	private int no; //글번호
	private String title; //글 제목
	private String boardday; // 작성일
	private String content; // 글 내용
 
	public Board() {}

	public Board(int no, String title, String boardday, String content) {
		super();
		this.no = no;
		this.title = title;
		this.boardday = boardday;
		this.content = content;
	}

//	public Board(int no, String title, String boardday, String content) {
//		BoardDB db = BoardDB.getInstance();
//		// null
//		this.no = db.makeNumber();
//		this.title = title;
//		Date currentTime = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");
//		this.content = content;
//	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", boardday=" + boardday + ", content=" + content + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoardday() {
		return boardday;
	}

	public void setBoardday(String boardday) {
		this.boardday = boardday;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

	
}
