package jan7th_26;

public class Computer {
	int sum1(int[] s) {
		int sum=0;
		for(int i=0;i<=s.length-1;i++) {
			sum+=s[i];
		} return sum;
	}
	int sum2(int...s) {
		int sum=0;
		for(int i=0;i<=s.length-1;i++) {
			sum+=s[i];
		} return sum;
	}

}
