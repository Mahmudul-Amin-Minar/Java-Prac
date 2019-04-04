package factorial;
import java.util.Scanner;

/**
 *
 * @author Mahmudul Amin Minar
 */
public class Factorial {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        long factorial=1;
        System.out.println("Enter a number: ");
        
        n = input.nextInt();
        
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        
        System.out.println("Factorial of "+n+ " is "+factorial);
    }
    
}
