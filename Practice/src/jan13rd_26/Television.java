package jan13rd_26;

public class Television extends RemoteControl{
	void turnOn() {System.out.println("TV를 켭니다");}
	void setVolume(int a) {
		if(a<0) {System.out.println("현재 TV 볼륨: 0");}
		else if(10<a) {System.out.println("현재 TV 볼륨: 10");}
		else {System.out.printf("현재 TV 볼륨: %d%n",a);}}
	void turnOff() {System.out.println("TV를 끕니다");}
}
