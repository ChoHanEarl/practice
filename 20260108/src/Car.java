
public class Car {
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;

	Car () {
		
	}
	
	Car (String car) {
		this.model = car;
	}
	
	Car (String car, String color) {
		this.model = car;
		this.color = color;
	}
	
	Car (String car, String color, int maxSpeed) {
		this.model = car;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
