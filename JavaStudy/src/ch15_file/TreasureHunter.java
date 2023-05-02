package ch15_file;

import java.io.File;

public class TreasureHunter {

	public static void main(String[] args) {
		String path = "/home/pc20/today/treasure";
		
		// treasure 폴더 내 파일을 먼저 찾기!!
		// 선착순 3명 커피쿠폰
		// proj의 src 풀더 내 파일목록 출력
		File folder = new File(path);
		System.out.println(folder);
		findfile(folder);
		
		File[] inner = folder.listFiles();
		for(int i = 0; i< inner.length; i++) {
			if(inner[i].isDirectory()) {
				File[] innerinner = inner[i].listFiles();
				for(int k = 0; k < innerinner.length; k++) {
					if(innerinner[k].isDirectory()) {
						
					}else {
						System.out.println(innerinner[k]);
					}
				}
			}else {
				System.out.println(inner[i]);
			
			
		}
				
	}
}
	public static void findfile(File folder){
		
		File[] inner = folder.listFiles();
		for(int i = 0; i < inner.length; i++) {
			if(inner[i].isDirectory()) {
				findfile(inner[i]);
			}else {
				System.out.println(inner[i]);
			}
		}
		
		
		
	}










} 













