//To find fibbonacci number

public class FibonacciNumber {
    public static int fibonacci(int n ) {
        if ( n == 1){
            return 1;}
            if (n == 0){
                return 0;
            }
    
        return  fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main (String [] args){
       System.out.println("Print the fibonacci series of 1 to 7 :");
    
    for (int i = 1 ; i <= 7 ; i++){

    
        System.out.println(" fibonacci "  + i + " is " + fibonacci(i));
    }
}
}
