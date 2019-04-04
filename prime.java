package prime;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahmudul Amin Minar
 */
public class Prime {
    
    
    public static boolean isPrime(int n){
        int limit, j, flag=0;
        limit = (int)Math.sqrt(n+1); //find the square root of given number.
        for(j=2; j<=limit; j++){ //loop through 2 to limit.
            if(n%j==0){ //check if given number is divisible by square root.
                flag++;
                return false;
            }
        }
        if(flag==0 && n!=1){
            return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //declaring a list for storing primes
        List primes = new ArrayList();
        
        int number, i;

        System.out.println("Enter max range: ");
        
        number = input.nextInt();

        for(i=2; i<=number; i++){   //loop through 2 to given number
            if(isPrime(i)){
                primes.add(i); //found the prime & save it to dynamic array.
            }
        }

        System.out.println("Primes are: " + primes);
    }
    
}
