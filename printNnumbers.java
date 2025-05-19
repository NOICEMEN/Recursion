import java.util.Scanner;

public class printNnumbers {
  public static void printOnetoN (int first , int n ){
    if (first > n) return;
    System.out.print(first + " ");
    printOnetoN(first + 1 ,n);

  }
  public static void printNtoOne(int n ){
    if (n == 0) return;
    System.out.print(n + " ");
    printNtoOne(n - 1 );
  }
  public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();


    System.out.println(" value of N : ");
    
    System.out.println("Print 1 to N:");
    printOnetoN(1, n);

    System.out.println("\nPrint N to 1:");
    printNtoOne(n);

    scanner.close();
  }
}
