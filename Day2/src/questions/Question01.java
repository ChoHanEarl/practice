package questions;

// 이 문제는 코드 타이핑하기 전에 
// 코드만 보고 결과를 예상해보세요.

// 정보처리기사 23년 1회차 문제
// 다음은 Java 코드이다.
// 아래의 Java 코드에서 출력되는 값을 작성하시오.

class Static {
	public int a = 20;
	static int b = 0;
}

public class Question01 {
	public static void main(String[] args) {
		
		int a;
		a = 10;
		Static.b = a;
		
		Static st = new Static();
		
		System.out.println(Static.b++);
		System.out.println(st.b);
		System.out.println(a);
		System.out.println(st.a);
	}
}
