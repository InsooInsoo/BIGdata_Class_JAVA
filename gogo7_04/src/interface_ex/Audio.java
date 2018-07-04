package interface_ex;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
	//turnOn()�߻�޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}
	//turnOff()�߻�޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ����� ������ : " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		if(mute ==true) {
			System.out.println("������� ���������մϴ�.");
		}else {
			System.out.println("����� �������Ÿ� �����մϴ�.");
		}
	}
}