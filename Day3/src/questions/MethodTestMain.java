package questions;

public class MethodTestMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.circleArea(5);
		double area = mt.circleRound(5);
		System.out.printf("원의 둘레 : %.2f\n", area);
	}
}

	//원의 넓이와 둘레 구하기
	//MethodTestMain클래스에서 반지름을 넘겨받는다.
	//메서드는 MethodTest클래스에 작성한다.
	//원의 넓이를 구하는 메소드 circleArea 만들기
	//원의 둘레를 구하는 메소드 circleRound 만들기
	//단, circleArea 메소드는 함수 안에서 출력문을 출력해야 한다.
	//circircleRound 메소드는 round 값을 반환하라.
	//원의 넓이 구하는 공식 : 3.14 * 반지름 * 반지름
	//원의 둘레 구하는 공식 : 2 * 3.14 * 반지름