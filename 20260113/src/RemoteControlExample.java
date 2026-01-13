
public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		Television t = new Television();
		Audio a = new Audio();
		
		t.turnOn();
		t.setVolume(-1);
		t.setVolume(11);
		t.setVolume(7);
		t.turnOff();
		System.out.println();
		a.turnOn();
		a.setVolume(-1);
		a.setVolume(11);
		a.setVolume(7);
		a.turnOff();
	}
	
	//TV를 켭니다.
	//현재 TV 볼륨: 0
	//현재 TV 볼륨: 10
	//현재 TV 볼륨: 7
	//TV를 끕니다.

	//오디오를 켭니다.
	//현재 오디오 볼륨: 10
	//현재 오디오 볼륨: 0
	//현재 오디오 볼륨: 7
	//오디오를 끕니다.

}