package ch09_class.quiz;

import java.util.ArrayList;
import java.util.Collections;

public class MovieDB {
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	private MovieDB(){
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재, 황전민, 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("범죄와의전쟁", "느그 서장 남천동 살제?", "최민식, 하정우, 조진웅", "ㅂㅈㅇㅇㅈㅈ"));
		movieList.add(new Movie("아저씨", "금이빨 빼고 다씹어줄게", "원빈, 김새론, 김희원", "ㅇㅈㅆ"));
		movieList.add(new Movie("실미도", "비겁한 변명입니다", "안성기, 허준호, 안성기", "ㅅㅁㄷ"));
		movieList.add(new Movie("타짜", "묻고 더블로 가! ", "김해수, 조승우, 유해진", "ㅌㅉ"));
		movieList.add(new Movie("명량", "전하, 신에게는 아직 12척의 배가 남아있사옵니다. ", "최민식, 류승룡, 조진웅", "ㅁㄹ"));
		movieList.add(new Movie("해바라기", "꼭 그렇게 다 가져가야만 속이 후련했냐!! ", "김래원, 김혜숙, 허이재", "ㅎㅂㄹㄱ"));
		movieList.add(new Movie("내부자들", "모히또 가서 몰디브 한 잔?", "이병원, 조승우, 배윤식", "ㄴㅂㅈ "));
		movieList.add(new Movie("신과 함께", "지나간 일에 대해 새로운 눈물을 낭비하지 말자", "하정우, 차태연, 주지훈", "ㅅㄱㅎㄲ"));
		movieList.add(new Movie("부당거래", "호의가 계속되면 그게 둘리인줄 알아", "황전민, 류승범, 유해진", "ㅂㄷㄱㄹ"));
		
	}
	
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList(){
		
		return movieList;
		}
		
	
	
}
