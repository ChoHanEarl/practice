
public class Computer {

	public int sum1(int[] arr) {
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			z += arr[i];
		}
		return z;
	}

	public int sum2(int... values) {
        int sum = 0;

        // values는 내부에서 '배열(int[])'처럼 쓰입니다.
        for (int i : values) {
            sum += i;
        }

        return sum;
    }
}

