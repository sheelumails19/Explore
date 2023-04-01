import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
       int num, a = 0,b=0, c =1;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number of times");
       System.out.println(" ");
       num = in.nextInt();
       System.out.println("Fibonacci Series of  " + num + " number is:");
       System.out.println("=================");
       for (int i=0; i<num; i++) {
           a = b;
           b = c;
           c = a+b;
           System.out.print(a + " ");    
       }      
   }
}