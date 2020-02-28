package test;

public class TestImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestImmutable t = new TestImmutable(120);
		TestImmutable t2 = t.modiy(120);
		TestImmutable t3 = t.modiy(100);
		TestImmutable t4 = new TestImmutable(1200);
		
		System.out.println(t==t2);
		System.out.println(t==t3);

	}

}
