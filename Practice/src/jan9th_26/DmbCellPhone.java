package jan9th_26;

public class DmbCellPhone extends CellPhone{
	String model;
	String color;
	int channel;
	public DmbCellPhone(String s, String s1, int a) {model=s; color=s1; channel=a;}
	void turnOnDmb() {System.out.printf("채널 %d번 DMB 방송 수신을 시작합니다%n", channel);}
	void changeChannelDmb(int a) {
		channel=a;
		System.out.printf("채널 %d번 으로 바꿉니다%n", channel);}
	void turnOffDmb() {System.out.println("DMB 방송 수신을 멈춥니다");}
}