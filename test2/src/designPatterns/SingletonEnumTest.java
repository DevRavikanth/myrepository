package designPatterns;

public class SingletonEnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonEnum sden = SingletonEnum.INSTANCE;
		
		
		sden.i=5;
		sden.show();
		SingletonEnum sden1 = SingletonEnum.INSTANCE;
		
		sden1.i=6;
		
		sden1.show();
		
		sden.show();
		
		System.out.println(sden.hashCode());
		System.out.println(sden1.hashCode());
	
	}

}
