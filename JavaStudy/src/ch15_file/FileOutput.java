package ch15_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		// 자바에서 파일의 내용 쓰기
		String filePath = "/home/pc20/today/test.txt";
		
		File test = new File(filePath);
		
		
		// new FileOutputStream(test) -> 기존파일 내용을 덮어씀
		// new FileOutputStream(test , true) -> 기존 파일에 이어 씀
		try(FileOutputStream fos = new FileOutputStream(test, true)) {
			String temp = "\n월요일도 쉬지롱~~~";
			
			// String 에 .getBytes()하면 byte[] 를 리턴
			byte[] tempByte = temp.getBytes();
			
			
			fos.write(tempByte);
			System.out.println("작성 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
