package problemsolving;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tno =0;
		
		System.out.println("Please enter number");
		
		
		//int x = 5;
		
		tno = Integer.parseInt(args[0]);//commandline
		for(int i = 1;i<=10;i++) {
			
			
			System.out.println(tno+" X  "+i+" = "+i*tno);
		}
	}

}
