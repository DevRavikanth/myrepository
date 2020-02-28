package hasARelPasingObject;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IwantSomeOne is = new IwantSomeOne();
		ResourceShared rs = new ResourceShared();
		
		//IwantSomeOne is = new IwantSomeOne(rs);
		IwantSomeOne is = new IwantSomeOne();
		IWantSomeTwo is2 = new IWantSomeTwo(rs);
		is.callingResorce();
		is2.callingResorce2();
		
		
	}

}
