package kimdaeil.kimdaeil0419;

public class Board {
	private int num; //글번호
	private String name; //글 제목
	private String boardday; // 작성일
	private String content; // 글 내용
 
	public Board() {}

	public Board(int num, String name, String boardday, String content) {
		super();
		this.num = num;
		this.name = name;
		this.boardday = boardday;
		this.content = content;
	}

	@Override
	public String toString() {
		return "board [num=" + num + ", name=" + name + ", boardday=" + boardday + ", content=" + content + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
