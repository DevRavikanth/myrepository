package EqulsAndHashcode;

public class EQSHSHC {
	public static void main (String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3=s2.intern();
		System.out.println(s2.equals(s3));
		
		
		
	}

}
