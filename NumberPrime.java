public class PrimeOrNot {
 
public static void main(String args[]) {

int num = 31;


// Corner case
                if (num <= 1)
                        System.out.println( num + " is not prime ");

                // Check from 2 to n-1
                for (int i = 2; i < num; i++)
                {
                        if (num % i == 0)
                                System.out.println( num + " is not prime ");
}
                System.out.println( num + " is prime ");
        }
        }