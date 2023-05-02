package ch16_network.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

// 연결된 소켓의 InputStream으로 들어온 텍스트 콘솔에 출력
public class ReceiveThread extends Thread{
	private Socket soc;
	
	public ReceiveThread(Socket soc) {
		this.soc = soc;
	}
	
	
	@Override
	public void run() {
		
		try {
			// 연결된 소캣의 inputStream으로 부터
			// 데이터를 읽어온다.
			BufferedReader reader 
			= new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			while(true) {
				// SendThread의 PrinWriter가 flush할때까지 대기함
				String msg = reader.readLine();
				
				System.out.println(msg);
				
				if(msg.equals("대화가 종료되었습니다.")) {
					break;
				}
			}
			soc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
