package casting;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-child�� ��ȯ ����");
		} else {
			System.out.println("method1-child�� ��ȯ���� ����");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-child�� ��ȯ ����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}