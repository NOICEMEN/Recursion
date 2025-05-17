//To count the digit the number

public class countdigit {
 public static  int countdigit (int n ) {
    if (n == 0 ){
        return 1;
    }

    n= Math.abs(n);
        int count = 0;
    while (n > 0) {
        n = n / 10;
        count++;

        
    }
    return count;

 }
 public static void main (String [] args) {
    int number  = 34567;
    int digitcounter = countdigit(number);
    System.out.println("number of digit " + number + " is " + digitcounter);
 }
}