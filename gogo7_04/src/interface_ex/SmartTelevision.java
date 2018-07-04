package interface_ex;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	private String url;
	private boolean mute;
	public void turnOn() {
		System.out.println("����ƮƼ�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("����ƮƼ�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume >RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ������ : " + this.volume);
	}
	public void searchable(String url) {
		System.out.println(url+ "�� �˻��մϴ�.");
	}
	@Override
	public void setMute(boolean mute){
		if(mute == true) {
			System.out.println("���Ұ� �մϴ�.");
		}else {
			System.out.println("���Ұ� �����մϴ�.");
		}
	}

}
