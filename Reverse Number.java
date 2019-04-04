package reversenumber;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Mahmudul Amin Minar
 */
public class ReverseNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        double reverseNumber = 0;
        Scanner input = new Scanner(System.in);
        
        number = input.nextInt();
        if(number==1){
            System.out.println(1);
            return;
        }
        //identify the number of digit
        int digits = (int)Math.ceil(Math.log10(number));
        
        while(number != 0){
            int remainder = number%10;
            reverseNumber += remainder*(Math.pow(10, --digits));
            number /= 10;
        }
        System.out.println("Reverse Number is: "+(int)reverseNumber);
    }
}
