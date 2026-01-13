
public class Television implements RemoteControl{
	int volume = 1;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume += volume;
		if (this.volume > 0) {
			System.out.println("현재 TV 볼륨: "+this.volume);
		} else System.out.println("현재 TV 볼륨: 0");
		
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}
	
	
}
