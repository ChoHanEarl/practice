package _20260107;

public class Computer {
	public int sum1(int[] values1) {
		// TODO Auto-generated method stub
		
		int sum1=0;
		for(int i=0; i<=values1.length-1; i++) {
			sum1 += values1[i];	
		}
		return sum1;
		
	}

	public int sum2(int... values) {
		// TODO Auto-generated method stub
		
		int sum2 = 0;
		for(int i=0; i<=values.length-1; i++) {
			sum2 += values[i];	
		}
		return sum2;
	}

}
