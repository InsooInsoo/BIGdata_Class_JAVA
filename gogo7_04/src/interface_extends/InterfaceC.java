package interface_extends;
//인터페이스C에 다중상속해주는 InterfaceA, InterfaceB
public interface InterfaceC extends InterfaceA, InterfaceB {
	public void methodC(); //추상메도스 methodC를 정의해준다.
	//InterfaceA와 InterfaceB에 있는 추상메소드도
	//Boby가 있는 실체 메소드도 구현해주어야 한다.
}
