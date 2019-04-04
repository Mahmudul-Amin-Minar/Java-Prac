package pkg2nd.largest;

/**
 *
 * @author Mahmudul Amin Minar
 */
public class Largest {

    
    //method for identifying second largest number
    public static void print2largest(int arr[],  int arr_size){
        int i, first, second; 
       
        first = second = Integer.MIN_VALUE; 
        for (i = 0; i < arr_size ; i++){
            /* If current element is smaller than  
            first then update both first and second */
            if (arr[i] > first){
                second = first; 
                first = arr[i]; 
            } 
       
            /* If arr[i] is in between first and  
               second then update second  */
            else if (arr[i] > second && arr[i] != first){
                second = arr[i]; 
            }
        } 
          
        if (second == Integer.MIN_VALUE){
             System.out.println("There is no second largest"+ " element\n"); 
        }
        else{
             System.out.println("The second largest element"+ " is "+ second); 
        }
    }
    
    
    //method for identifying second minimum number
    public static void print2minimum(int arr[],  int arr_size){
        int i, first, second; 
       
        first = second = Integer.MAX_VALUE; 
        for (i = 0; i < arr_size ; i++){
            /* If current element is smaller than  
            first then update both first and second */
            if (arr[i] < first){
                second = first; 
                first = arr[i]; 
            } 
       
            /* If arr[i] is in between first and  
               second then update second  */
            else if (arr[i] < second && arr[i] != first){
                second = arr[i]; 
            }
        } 
          
        if (second == Integer.MAX_VALUE){
             System.out.println("There is no second minimum"+ " element\n"); 
        }
        else{
             System.out.println("The second minimum element"+ " is "+ second); 
        }
    }
    
    
    //methid to determine sum and average of some numbers
    public static void sumAvarage(int arr[], int arr_size){
        
        double avarage, sum=0;
        for(int i=0; i<arr_size; i++){
            sum+=arr[i];
        }
        avarage = sum/arr_size;
        
        System.out.println("Sum: "+sum);
        System.out.println("Avarage: "+avarage);
    
    }
    
    public static void maxMin(int arr[], int arr_size){
        int max = Integer.MIN_VALUE, min = arr[0];
        for(int i=0; i<arr_size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
    
    
    //main methid
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {12, 35, 1, 10, 34, 1}; 
        int n = arr.length; 
        print2largest(arr, n);
        print2minimum(arr, n);
        sumAvarage(arr, n);
        maxMin(arr, n);
    }
    
}
