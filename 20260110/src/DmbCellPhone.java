
public class DmbCellPhone extends CellPhone {
	String model;
	String color;
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	void changeChannelDmb(int a) {
		System.out.println( "채널 "+a +"번으로 바꿉니다.");
	}
	void turnOffDmb () {
		System.out.println("DMB 방송 수신을 멈춥니다.");
		
	}
	
}
