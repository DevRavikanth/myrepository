package oops;

public class ObjectRefer2 {
	
	ObjectREfer or;

	public ObjectREfer getOr() {
		return or;
	}

	public void setOr(ObjectREfer or) {
		this.or = or;
	}

	public ObjectRefer2(ObjectREfer or) {
		super();
		this.or = or;
	}
	
	public ObjectRefer2() {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		String name = or.getName();
		int num = or.getNu();
		System.out.println(name+""+num);
		
	}
}
