public class Nnumber {
    public static int number (int n ){
        if (n == 0) return 0;
         return n + number(n - 1);

    }

    public static void main (String [] args){
         int N = 5;
         System.out.println( "number = " + number (N));
    }

}
