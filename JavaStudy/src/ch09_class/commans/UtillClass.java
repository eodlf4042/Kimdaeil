package ch09_class.commans;
// 유용한 메소드를 가지고 있는 클레스
public class UtillClass {

	
	public static double weRound(double num, int n) {
		
		int ten = 1;
		for(int i = 0; i < n; i++) { // n회 반복 for문
			ten *= 10;
		}
			
		
		num *= ten;
		long temp = Math.round(num);
		
		double result = (double)temp / ten;
		return result;
	}
}
