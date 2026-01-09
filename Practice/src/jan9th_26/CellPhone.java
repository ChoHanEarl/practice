package jan9th_26;

public class CellPhone {
	void powerOn() {System.out.println("전원을 켭니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String s) {System.out.printf("자기: %s%n",s);}
	void receiveVoice(String s) {System.out.printf("상대방: %s%n",s);}
	void hangUp() {System.out.println("전화를 끊습니다");}
}
