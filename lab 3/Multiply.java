

package lab.multiply;
import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    
       System.out.print("Enter  number a = ");
       int a=sc.nextInt();
            System.out.print("Enter  number b = ");
       int b=sc.nextInt();
       
           int addition=sum(a,b);
           System.out.println("The sum from"+a+" to " +b+ " is "+addition);
       
    
    }
    
    public static int sum(int a,int b){
       
     if(a==b){
            return a;
        } else{
             return a+sum(a+1,b);
        }
    }
}
