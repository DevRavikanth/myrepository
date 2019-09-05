package problemsolving;
public class FactorialWithWhileLoop {
   public static void main(String args[]){
      int i =1, factorial=1, number=5;
    
      while(i <=number) {
         factorial = factorial * i;
         i++;
      }
      System.out.println("Factorial of the given number is:: "+factorial);
   }
}