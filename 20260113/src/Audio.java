
public class Audio implements RemoteControl{
	int volume = 11;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume += volume;
		if (this.volume > 10) {
			this.volume = 10;
		} 
		System.out.println("현재 오디오 볼륨: "+ this.volume);
		this.volume = 0;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}
	
	
}
