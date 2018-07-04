package interface_ex;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	private String url;
	private boolean mute;
	public void turnOn() {
		System.out.println("스마트티비를 켭니다.");
	}
	public void turnOff() {
		System.out.println("스마트티비를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume >RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 : " + this.volume);
	}
	public void searchable(String url) {
		System.out.println(url+ "을 검색합니다.");
	}
	@Override
	public void setMute(boolean mute){
		if(mute == true) {
			System.out.println("음소거 합니다.");
		}else {
			System.out.println("음소거 해제합니다.");
		}
	}

}
