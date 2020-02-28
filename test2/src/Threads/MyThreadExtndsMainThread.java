package Threads;

public class MyThreadExtndsMainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTreadExtending mte = new MyTreadExtending();
		mte.start();
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Iam Main Thread Entending Thread Class");
		}

	}

}
