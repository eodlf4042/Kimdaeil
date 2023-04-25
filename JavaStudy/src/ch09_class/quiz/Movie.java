package ch09_class.quiz;

public class Movie {
	String title; // 영화제목
	String quotes; // 명대사
	String actors; // 배우
	String word; //초성
	
	public Movie() {}
	public Movie(String title, String quotes, String actors, String word) {
		super();
		this.title = title;
		this.quotes = quotes;
		this.actors = actors;
		this.word = word;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", quotes=" + quotes + ", actors=" + actors + ", word=" + word + "]";
	}
	public String getTitle() {
		return title;
	}
	
	

	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuotes() {
		return quotes;
	}
	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}




}
