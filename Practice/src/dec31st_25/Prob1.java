package dec31st_25;

import java.util.Arrays;

public class Prob1 {

	public static void main(String[] args) {
		int[] s=new int[10];
		int temp;
		for(int i=0;i<=9;i++) {
				s[i]=i+1;}
		for(int j=0;j<s.length;j++) {
			System.out.println(Arrays.toString(s));
			int start=s[0];
			for(int a=0;a<s.length-1;a++) {
			s[a]=s[a+1];}
			s[s.length-1]=start;}
	}
}
		
				
			
		
	


