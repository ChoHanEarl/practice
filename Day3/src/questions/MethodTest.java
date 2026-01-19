package questions;

public class MethodTest {
	void circleArea(int r) {
		double area = 3.14 * r * r;
		System.out.println("원의 넓이 : " + area);
	}
	
	double circleRound(int r) {
		double round = 2 * 3.14 * r;
		return round;
	}
}
