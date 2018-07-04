package interface_ex;

public class RemoteControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc =null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(150);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		
		//정적메소드 사용
		RemoteControl.changeBattery();
	}

}
