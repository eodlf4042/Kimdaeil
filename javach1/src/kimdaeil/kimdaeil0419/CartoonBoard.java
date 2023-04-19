package kimdaeil.kimdaeil0419;

public class  CartoonBoard extends Board {
	
	
	private String img; // 글 이미지
	
	public CartoonBoard() {}

	
	public CartoonBoard(int num, String name, String boardday, String content, String img) {
		super(num, name, boardday, content);
		this.img = img;
	}

	@Override
	public String toString() {
		return "CartoonBoard [num=" + getNum() + ", name=" + getName() + ", boardday=" + getBoardday() + ", content=" + getContent()
				+ ", img=" + img + "]";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	
}

