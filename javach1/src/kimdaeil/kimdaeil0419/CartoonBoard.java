package kimdaeil.kimdaeil0419;

public class  CartoonBoard extends Board {
	
	
	private String img; // 글 이미지
	
	public CartoonBoard() {}

	public CartoonBoard(int no, String title,  String boardday, String content, String img) {
		super(no,title,boardday,content);
		this.img = img;
	}

	
	@Override
	public String toString() {
		return "CartoonBoard [no=" + getNo() + ", title=" + getTitle() +
				", boardday=" + getBoardday() + ", content=" + getContent() + "img=" + img + "]";
	}
	
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}

