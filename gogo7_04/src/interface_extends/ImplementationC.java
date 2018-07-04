package interface_extends;
//InterfaceC의 추상메소드를 Boby를 줘서 정의한다. 
//추상메소드 정의해 준거 모두 정의해 줘야 오류가 안난다.
public class ImplementationC implements InterfaceC{
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}

}
