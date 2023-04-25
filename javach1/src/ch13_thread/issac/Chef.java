package ch13_thread.issac;

public class Chef  extends Thread{
	// 실글톤 으로 있는 이삭객체 가져오기
	private Issac issac = Issac.getInstance();
	
	public EndCook endCook;
	
	
	 @Override
	public void run() {
		for(int i = 0;  i< 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			issac.makeToast();
		}
		endCook.finish();
	}
	
}
