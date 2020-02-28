package oops;

public class MethodOverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sc = new SuperClass(); //{};//annonymous inner class because of SuperClass is Abstract abstart class
		MethoOveride mo = new MethoOveride();
		
		SuperClass s = new MethoOveride();// Parent to Child 
		//MethoOveride m =(MethoOveride) new SuperClass();//Child reference to parent---class cast exception occurs
		
		sc.m1();//parent to parent
		
		System.out.println(sc.i+" super ref -> to super ");//super only called
		
		mo.m1();//child to child
		
		System.out.println(mo.i+" Child ref -> to child ");//child only called
		
		mo.m1(10);//child to child but method not overriden availble for child
		s.m1();//overiding method called, parent reference to child
		
		System.out.println(s.i+" super ref -> to child ");//super variable only called
		mo.m1(23);
		s.m1(34);//overridden super->child
		sc.m1(45);
		//m.m1();
		
	}

}
