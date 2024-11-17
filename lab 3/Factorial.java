

package lab.factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    
       System.out.print("Enter a number = ");
       int n=sc.nextInt();
       if(n>=0){
           int multiply=factorial(n);
           System.out.println("the multiplication from 1 to "+n+" is = "+multiply);
       }
    
    }
    
    public static int factorial(int n){
       
     if(n>0){
            return n*factorial(n-1);
        } else{
            return 1;
        }
    }
}
