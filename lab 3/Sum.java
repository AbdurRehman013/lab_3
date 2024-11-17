

package lab.sum;
import java.util.Scanner;


public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
         
        while (true){
             System.out.println("Enter a number:");
             int input=sc.nextInt();
             if (input>=0){
                 int sumOfOdd=oddsum(input);
                 int sumOfEven=evensum(input);
                 System.out.println("The sum of odd numbers is = "+sumOfOdd);
                  System.out.println("The sum of even numbers is = "+sumOfEven);
             }
             else{
                 break;
             }
        } }
    
     public static int oddsum(int input){
        if (input<=0){
            return 0;
        }
        if ((input-1)%2!=0){
            return (input-1)+oddsum(input-1); 
        }
        else{
            return oddsum(input-1); 
        }
    }
        
    public static int evensum(int input){
        if (input<=0){
            return 0;
        }
        if ((input-1)%2==0){
            return (input-1)+evensum(input-1); 
        }
        else{
            return evensum(input-1); 
        }
    }
}
