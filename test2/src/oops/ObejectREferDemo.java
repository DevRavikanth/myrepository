package oops;

public class ObejectREferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectREfer or = new ObjectREfer();
		or.setName("Ravi");
		or.setNu(10);
		
		System.out.println(or.getName());
		System.out.println(or.getNu());
		
		ObjectREfer or1 = new ObjectREfer();
		or1=or;
		ObjectRefer2 or2 = new ObjectRefer2();
		or2.setOr(or);
		System.out.println(or1.getName());
		System.out.println(or1.getNu());
		System.out.println(or1.hashCode());
		System.out.println(or.hashCode());
		System.out.println(or2.hashCode());
		or2.display();
	}

}
