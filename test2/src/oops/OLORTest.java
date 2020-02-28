package oops;

public abstract class OLORTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SuperClass sc = new SubClass();//Parent class Refrence to Cjild Object
		System.out.println(sc.name);
		sc.m1();//SubClass Methos called
		sc.m1(10);
		
		SubClass sb=new SubClass(); //Child To Child
		System.out.println(sb.name);
		sb.m1();//SubClass Methos only called
		sb.m1(100);
		sb.m1(10, "dev");
	}

}
