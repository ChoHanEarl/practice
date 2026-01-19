package questions;

public class TimeTable {

	void showTable(int dan) {
		System.out.printf("%d단\n", dan);
		for(int i = 1; i < 10; i++ ) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
}
//문제설명 :
//TimesTable클래스에서 showTable()메서드를 정의한다.
//showTable()메서드에는 구구단을 출력하는 코드를 작성.
//
//TimesTableMain클래스를 만들어 TimesTable객체를 생성하고 
//이를 이용하여 아래와같은 결과를 출력하자.
//
//Scanner를 통해 값을 받는 작업은 반드시 TimesTableMain클래스에서 하도록 한다.
//
//출력할 단을 입력 : 5
//5단
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45