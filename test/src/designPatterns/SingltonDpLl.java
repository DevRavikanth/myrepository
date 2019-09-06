package designPatterns;

public class SingltonDpLl {


		static SingltonDpLl sd;//Lazy Loading Loading
		
		private SingltonDpLl(){
			
			System.out.println("Iam Singleton lazy");
		}
		//Thread Safe
		//static synchronized SingltonDpLl getInstance() {// Decrease performance
		  static  SingltonDpLl getInstance(){							

			  if(sd == null) {
				  
				  synchronized(SingltonDpLl.class){ //double checked locking in static block
					  
					  if(sd == null)
					  sd = new SingltonDpLl();
					  
				  }
			
			}
			return sd;
		}
		//optional
		public void method() {

			System.out.println("Hello Iam Singleton");
		}

	}



