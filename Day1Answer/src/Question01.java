
public class Question01 {
	public static void main(String[] args) {
		// 다음과 같은 모양으로 출력되게 코드를 작성하세요.
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// 4 5 6 7 8 9 10 1 2 3
		// 5 6 7 8 9 10 1 2 3 4
		// 6 7 8 9 10 1 2 3 4 5
		// 7 8 9 10 1 2 3 4 5 6
		// 8 9 10 1 2 3 4 5 6 7
		// 9 10 1 2 3 4 5 6 7 8
		// 10 1 2 3 4 5 6 7 8 9

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num = i + j;
				if(num > 10) {
					num -= 10;
				}
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
