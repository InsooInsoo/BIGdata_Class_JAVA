package casting;

public class Child3 extends Parent3{
	private String name;
	
	public Child3() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	public Child3(String name) {
		this.name = name;
		System.out.println("Parent(String name) call");
	}

}
