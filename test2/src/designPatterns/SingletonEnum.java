package designPatterns;

public enum SingletonEnum {
	
	INSTANCE;
	int i;
	
	public void show() {
		
		System.out.println(i);
	}

}
