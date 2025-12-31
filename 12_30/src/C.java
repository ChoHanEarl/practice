class A {
	private int a;
	public A(int a) {
		this.a = a;
		// public B에서 받은 10 private int a 에 할당된다. 
	}
	public void display() {
		System.out.println("a=" + a); // 결과는 10이 출력된다.
		
	}
}

class B extends A {
	public B(int a) {
		super(a);
		// 생성자의 10이 할당 연산자 super로 A의 생성자에 할당된다. 
		super.display(); // 부모클래스의 display 메소드를 실행
	}
	
}

public class C {
	public static void main(String[] args) {
		B object = new B(10); // 클래스 B를 생성하고 변수 object에 할당, 생성자에 매개변수 10이 들어간다.
	}
}

// 출력 결과를 쓰세요. : a = 10
// 코드의 흐름을 설명하세요 : 주석 기술 
// 이 코드를 보고 떠오르는 자바키워드를 적어보세요 캡슐화, extends,