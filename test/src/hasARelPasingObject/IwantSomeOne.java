package hasARelPasingObject;

public class IwantSomeOne {
	
	ResourceShared r;
	
	IwantSomeOne(){}
	
	
	  IwantSomeOne(ResourceShared r){
	  
	  this.r=r;
	  
	  }
	 
	
	void callingResorce() {
		
		ResourceShared.sharedResource();
	}
	

}
