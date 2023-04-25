package kimdaeil.submit12.board;

public class CartoonBoard extends Board{
	private String img;

	public CartoonBoard() {
		super();
	}

	public CartoonBoard(int no, String title
			, String content, String date, String img) {
		super(no, title, content, date);
		this.img = img;
	}

	@Override
	public String toString() {
		return super.toString() + "[img=" + img + "]";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	
}
