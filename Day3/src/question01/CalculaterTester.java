package question01;

public class CalculaterTester {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator claculater2 = new Calculator2();
		Calculator3 claculater3 = new Calculator3();
		
		int minus = claculater2.calculation(30,15);
		System.out.println("CalMinus : " + minus);
		
		int plus = claculater3.calculation(30,15);
		System.out.println("CalPlus : " + plus);
	
	}

}
