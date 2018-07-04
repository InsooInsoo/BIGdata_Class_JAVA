package casting;

public class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	};
	public void turnOn() {
		System.out.println("method2-child로 변환 성공");
	}
	public void turnOff() {
		System.out.println("method2-child로 변환 성공");
	}
}
