package designPatterns;

public class SingletonTest {

	public static void main(String[] args) {
		//SingltonDp sd1 = new SingltonDp();
		SingltonDp sd1 = SingltonDp.getInstance();
		//sd1.method();
		
		//SingltonDpLl sdl = SingltonDpLl.getInstance();
		//SingltonDpLl sd2 = SingltonDpLl.getInstance();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingltonDpLl sdl = SingltonDpLl.getInstance();
			}
			
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingltonDpLl sdl = SingltonDpLl.getInstance();
			}
			
			
		});
		
	 t1.start();
		/*
		 * try { Thread.sleep(10); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	 
	 t2.start();
	}

}
