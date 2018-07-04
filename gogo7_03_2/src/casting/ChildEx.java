package casting;

public class ChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 ="data2"
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		
		Child chil = new Child();
		chil.field2 = "rrr";
		chil.method3();
	}

}
