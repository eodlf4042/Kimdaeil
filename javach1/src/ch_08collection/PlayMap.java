package ch_08collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PlayMap {

	public static void main(String[] args)  {
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: 태연", "사랑은 늘 도망가: 임영웅", "취중고백: 멜로망스", "언제나 사랑해: 케이시", "듣고 싶을까: MSG워너비", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE", "회전목마: sokodomo", "너, 너: 휘인", "SMILEY: YENA", "호랑수월가: 탑현", "리무진: 비오", "RUN2U: STAYC", "눈이 오잖아: 이무진", "Counting Stars: 비오", "신호등: 이무진", "어제처럼: 폴킴", "잊었니: 임영웅", "잊을 수 있을까: 노을", "HERO: 임영웅", "Can't Control Myself: 태연", "Next Level: aespa", "strawberry moon: 아이유", "겨울잠: 아이유", "끝사랑: 임영웅", "드라마: 아이유", "Bk Love: 임영웅", "만남은 쉽고 이별은 어려워: 베이식", "Weekend: 태연", "Savage: aespa", "Butter: 방탄소년단", "Dynamite: 방탄소년단", "OHAYO MY NIGHT: 디핵", "사랑인가 봐: 멜로망스", "라일락: 아이유", "Celebrity: 아이유", "낙하: 악동뮤지션", "Blueming: 아이유", "롤린: 브레이브걸스", "고백: 멜로망스", "그런 밤: 태연"));
		
		
		System.out.println(playList.get(0));
		
		
		HashMap<String, String> palyMap = new HashMap<>();
		
		
	    
		
		// palyMap에 key값은 노래제목, value값은 가수명이 되도록
		// playList의 데이터들을 담아보세
		for(int i = 0; i < playList.size(); i++){
			String[] temp = playList.get(i).split(": ");
			
			//temp[0] = 제목
			//temp[1] = 가수
			palyMap.put(temp[0], temp[1]);
		}
		
		System.out.println("\n================================================================================\n");

		Set<String> keySet= palyMap.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + palyMap.get(key));
		}
		System.out.println("\n================================================================================\n");
		
		
		//검색
		//searchMap("제목", "사랑", palyMap);
		
		//searchMap("가수", "아이유", palyMap);
		
		
		// 아이유 노래목록 만들고,
		// 태연의 노래목록 만들고,
		// 임영웅 노래목록 만들어서
		// 아이유 : [불루밍, 스트로베리, 겨울잠]
		// 태연 : [불티야, 만약에]
		// 임영웅 : [사랑은 늘도망가, 끝사랑]
		
		//	HashMap<String, ArrayList<String>>
		
		
		ArrayList<String> iuSongs = makSongList("아이유", playList);
		System.out.println(iuSongs);
		
		HashMap<String, ArrayList<String>> singMap = new HashMap<String, ArrayList<String>>();
		
		
		singMap.put("아이유", iuSongs);
		singMap.put("태연", makSongList("태연",playList));
		singMap.put("임영웅", makSongList("임영웅",playList));
			
		
		
		
		Set<String> keys = singMap.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + singMap.get(key));
		}
		
		
		
		
		
		
		
		
		
		

	}//메인
	
	//가수 이름을 넣으면 그 가수의 노래목록(ArrayList < String)을 만들자
	
	public static ArrayList<String> makSongList(String name, 
			ArrayList<String> playList){
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0; i < playList.size(); i++) {
			String[] temp = playList.get(i).split(": ");
			
			if(name.equals(temp[1])) {
			   result.add(temp[0]);
			}
		}
		 return result;
	}
	
	
	
	
	
	

		
		
		public static void searchMap(String option, String keyword, HashMap<String, String> playMap) {
			
			//playMap을 순회
			//keySet 이용
			Set<String> keySet = playMap.keySet();
			
			for(String key : keySet) {
				if(option.equals("제목")) {
					//Key 값 중에 keyword를 포함하고 있는 데이터 체크
					if(key.contains(keyword)) {
						System.out.println(key + ": " + playMap.get(key));
					}
				}else if(option.equals("가수")) {
					//Value 값 중에 keyword를 포함하고 있는 데이터 체크
					if(playMap.get(key).contains(keyword)){
						System.out.println(key + ": " + playMap.get(key));
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

}
