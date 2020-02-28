package hasARelPasingObject;

public class IWantSomeTwo {
	
	ResourceShared r;
	
	IWantSomeTwo(){}
	
	IWantSomeTwo(ResourceShared r){
		
		this.r=r;
		
	}
	
	void callingResorce2() {
		
		r.sharedResource();
	}

}
