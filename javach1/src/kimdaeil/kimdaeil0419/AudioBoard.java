package kimdaeil.kimdaeil0419;

public class AudioBoard extends Board{
	
	private String odio; // 오디오파일
	
	public AudioBoard() {}



	public AudioBoard(int num, String name, String boardday, String content, String oido) {
		super(num, name, boardday, content);
		this.odio = odio;
	}
	

	@Override
	public String toString() {
		return "CartoonBoard [num=" + getNum() + ", name=" + getName() + ", boardday=" + getBoardday() + ", content=" + getContent()
				+ ", odio=" + odio + "]";
	}


	public String getOdio() {
		return odio;
	}

	public void setOdio(String odio) {
		this.odio = odio;
	}
	

}
