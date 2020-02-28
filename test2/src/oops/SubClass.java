package oops;

public class SubClass extends SuperClass{
	public int x= 10;
	public String name = "Rocky";
	
	SubClass(){
		
		super();
	}
	
	public int m1() {
		
	System.out.println("am Subclass");
	
	return 5;
	}
	
	public int m1(int x) {
		
		System.out.println("Iam Sub");
		
		return x;
	}
	public int m1(int y,String x) {
		
		System.out.println("Iam Sub");
		
		return 10;
	}

}
