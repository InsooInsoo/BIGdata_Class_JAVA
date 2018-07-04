package interface_ex;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
	//turnOn()추상메소드의 실체 메소드
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	//turnOff()추상메소드의 실체 메소드
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨은 : " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		if(mute ==true) {
			System.out.println("오디오를 소음제거합니다.");
		}else {
			System.out.println("오디오 소음제거를 해제합니다.");
		}
	}
}
