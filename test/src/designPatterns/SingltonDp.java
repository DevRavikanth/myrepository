package designPatterns;

public class SingltonDp {

	static SingltonDp sd = new SingltonDp();//Eager Loading
	
	private SingltonDp(){
	}
	
	static SingltonDp getInstance() {
		
		return sd;
	}
	
	//optional
	public void method() {

		System.out.println("Hello Iam Singleton");
	}


}
