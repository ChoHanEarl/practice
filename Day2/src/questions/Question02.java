package questions;

// 이 문제 역시 코드 타이핑 전에
// 결과를 예상해보세요.

// 정보처리기사 23년도 1회차 문제
// 다음 Java 코드에서 알맞은 출력 값을 작성하시오.

abstract class Vehicle {
	
	String name;
	abstract public String getName(String val);
	
	public String getName() {
		return "Vehicle name: " + name;
	}
	
}

class Car extends Vehicle {
	public Car(String val) {
		name = super.name = val;
	}
	
	public String getName(String val) {
		return "Car name:" + val;
	}
	
	public String getName(byte val[]) {
		return "Car name:" + val;
	}
}

public class Question02 {
	public static void main(String[] args) {
		
		Vehicle obj = new Car("Spark");
		System.out.println(obj.getName());
		
	}
}
