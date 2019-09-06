package EqulsAndHashcode;

public class TestSuperandSubHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChildHashCode chc = new ChildHashCode();
		//SuperHashCode shc = new SuperHashCode();
		
		System.out.println("subclas Hash code"+chc.hashCode());
		//System.out.println(shc.hashCode());
		chc.displayHashodeSuper();
	}

}
