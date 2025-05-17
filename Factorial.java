//To find factorial 

public class Factorial {
     public static int Factorial (int n ){
        if (n == 0 || n == 1){
          return 1;
          
        }
        return n * Factorial(n-1);
     }
     public static void main (String [] args){
       int number = 5;
       int result = Factorial (number);
       System.out.println("factorial of 5 " + result);
     }
}
