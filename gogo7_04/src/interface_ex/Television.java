package interface_ex;

public class Television implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume <RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨은 : " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("티비 볼륨을 소거합니다.");
		}else {
			System.out.println("티빌 볼륨 소거를 해제합니다.");
		}
	}

}
