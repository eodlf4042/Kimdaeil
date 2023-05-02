package ch14_Jdbc_Jps.vo;

public class WordGameVo {
	private String words;

	public WordGameVo() {}
	public WordGameVo(String words) {
		super();
		this.words = words;
	}
	
	@Override
	public String toString() {
		return "WordGameVo [words=" + words + "]";
	}
	
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	
	
}
