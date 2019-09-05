package Threads;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChildThread mct = new MyChildThread();
		Thread t = new Thread(mct);
		t.start();//started child thread
		
			for(int i=0;i<10;i++) {
			
			System.out.println("Iam Main Thread");
		}
		

	}

}
 