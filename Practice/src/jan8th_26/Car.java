package jan8th_26;

public class Car {
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	Car(String s){model=s;}
	Car(String s, String s1){model=s; color=s1;}
	Car(String s, String s1, int c){model=s; color=s1; maxSpeed=c;}
}