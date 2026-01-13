package jan13rd_26;

public class RemoteControlExample {

	public static void main(String[] args) {
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
}