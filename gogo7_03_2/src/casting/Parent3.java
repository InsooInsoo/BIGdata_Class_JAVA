package casting;

public class Parent3 {
	public String nation;
	
	public Parent3() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	public Parent3(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

}
