package questions;

import java.util.Scanner;

public class TImeTableMain {
	public static void main(String[] args) {
		TimeTable tt = new TimeTable();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입략 : ");
		int dan = sc.nextInt();
		tt.showTable(dan);
	}
}
