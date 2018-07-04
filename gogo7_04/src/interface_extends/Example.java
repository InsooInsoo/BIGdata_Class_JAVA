package interface_extends;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC Ic = new ImplementationC();//ImplementationC의 객체 Ic를 생성해준다.
		InterfaceA a = Ic;
		a.methodA();
		InterfaceB b =Ic;
		b.methodB();
		InterfaceC c =Ic; //상속받은 InterfaceA와 
		                  //InterfaceB의 추상메소드를 사용할 수있다.
		c.methodA();
		c.methodB();
		c.methodC();
		

	}

}
