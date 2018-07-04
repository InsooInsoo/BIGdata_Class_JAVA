package interface_ex;

public class SmartRemoteControlEx {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc =tv;
		rc.turnOn();
		rc.turnOff();
		
	}
}
