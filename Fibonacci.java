package fibonacci;
import java.util.Scanner;

/**
 *
 * @author Mahmudul Amin Minar
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n, next, fibonacci1 = 0, fibonacci2 = 1;
        
        System.out.println("Enter a number: ");
        n = input.nextInt();
        
        System.out.println(n+"th fibonacci numbers are:");
        //System.out.print(fibonacci1+" "+fibonacci2 + " ");
        
        for(int i=1; i<=n; i++){
            
            System.out.print(fibonacci1+" ");
            next = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = next;
            
        }
    }
    
}
