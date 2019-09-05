package problemsolving;

public class Febnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		for(int i =0;i<10;i++) {
			c= a+b;
			System.out.println(c);//print the value in c
			a=b;//swap the b value to a
			b=c;//swap the c value to b
		}
		
		
	}

}
