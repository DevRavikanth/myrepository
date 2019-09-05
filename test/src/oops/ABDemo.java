package oops;

public class ABDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		A aa = new B();
		
		((B) aa).m1();//no method in A then Typecasting will get the method from child class or define method in parent class
		//aa.m1(); //if no method in child then returns superclass method 

	}

}
