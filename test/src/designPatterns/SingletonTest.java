package designPatterns;

public class SingletonTest {

	public static void main(String[] args) {
		//SingltonDp sd1 = new SingltonDp();
		SingltonDp sd1 = SingltonDp.getInstance();
		sd1.method();
	}

}
