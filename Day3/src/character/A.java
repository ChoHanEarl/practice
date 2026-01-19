package character;

import java.util.Scanner;

public class A {
	
	String s;
	
	void a() {
		try {
			int a = 10 / 0;
		} catch(Exception e) {
			System.out.println("예외");
			throw new RuntimeException();
		}
	}
	
}
