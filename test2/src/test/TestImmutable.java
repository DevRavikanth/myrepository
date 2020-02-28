package test;

final public class TestImmutable{
	
	private int i;



	public TestImmutable(int i) {
		
		this.i = i;
	}
	
	public TestImmutable modiy(int i) {
		
		if(this.i==i) {
			
			return this;
			
		}else {
			
			
		return new TestImmutable(i);
		
		}	
		
	}
	
	public int getI() {//optional
		return i;
	}


}
