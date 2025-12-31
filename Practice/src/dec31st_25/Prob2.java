package dec31st_25;

import java.util.Arrays;
import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("등록할 인원수:");
		int input=sc.nextInt();
		String[][] result=new String[input][3];
		for(int i=0;i<=input-1;i++) {
		System.out.println("이름:  수학:  영어:");
		result[i][0]=sc.nextLine();
		result[i][1]=sc.nextLine();
		result[i][2]=sc.nextLine();
		}
		System.out.printf("%d명 등록 완료", input);
		for(int i=0;i<=input-1;i++) {
		System.out.println(Arrays.toString(result[i]));}
		}

}
