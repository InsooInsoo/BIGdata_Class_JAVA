package interface_extends;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC Ic = new ImplementationC();//ImplementationC�� ��ü Ic�� �������ش�.
		InterfaceA a = Ic;
		a.methodA();
		InterfaceB b =Ic;
		b.methodB();
		InterfaceC c =Ic; //��ӹ��� InterfaceA�� 
		                  //InterfaceB�� �߻�޼ҵ带 ����� ���ִ�.
		c.methodA();
		c.methodB();
		c.methodC();
		

	}

}
