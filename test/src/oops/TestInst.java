package oops;

public class TestInst {
	
	Animal a = new Animal();

	public static void m1() {
		TestInst ti = new TestInst();
		ti.a.anMethod();
		System.out.println("iam satatic method of current");
		ti.m2();
		
	}
	
	public void m2() {
		TestInst ti = new TestInst();
		ti.a.anMethod();
		System.out.println("iam instance method of current");
		
		
	}
	public static void main(String[] args) {
		/*
		 * TestInst ti = new TestInst(); ti.a.anMethod();
		 */
		//TestInst.m1();
		TestInst ti = new TestInst();
		ti.m2();
	}

}
