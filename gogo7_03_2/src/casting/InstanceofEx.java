package casting;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-child로 변환 성공");
		} else {
			System.out.println("method1-child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-child로 변환 성공");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
