package _20260109;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	String sendVoice(String message) {
		return "자기: " + message;
	}
	String receiveVoice(String message) {
		return "상대방: " + message;
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}

}
