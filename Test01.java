package problem;

public class Test01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int sum = i + j;
				if (sum > 10) {
					sum -= 10;
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

}
