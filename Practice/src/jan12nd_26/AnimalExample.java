package jan12nd_26;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog("강아지1");
		Cat cat = new Cat("고양이1");
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		Animal animal = null;
		animal = new Dog("강아지2");
		animal.sound();
		
		animal = new Cat("고양이2");
		animal.sound();
		System.out.println("-----");
		
		animalSound(new Dog("강아지3"));
		animalSound(new Cat("고양이3"));
	}
	public static void animalSound(Animal animal) {
		animal.sound();
}
}