import oops.A;
import oops.B;

public class HashcodeTEst {
	


public static void main(String [] args) {
	
	HashcodeTEst ht = new HashcodeTEst();
	
	A a = new A();
	B b = new B();
	System.out.println(ht.hashCode());
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
}
}
