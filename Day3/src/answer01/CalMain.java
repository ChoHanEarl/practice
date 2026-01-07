package answer01;

public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		System.out.println(cp.getNum(10,20));
		CalMinus cm = new CalMinus();
		System.out.println(cm.getNum(10,20));
	}
}
