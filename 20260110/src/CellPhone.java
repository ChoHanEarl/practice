
public class CellPhone {
	CellPhone() {
		
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void bell () {
		System.out.println("벨이 울립니다.");
	}
	void receiveVoice (String a) {
		System.out.println("자기: "+a);
	}
	void sendVoice(String a) {
		System.out.println("상대방: "+a);
		
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}
