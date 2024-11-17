/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab.patient;
import java.util.Scanner;



public class Patient {
  double pContact;
    int  pAge, pBill;
   int pNumber;
    String pEmail, pComplaint, pName;
    Scanner sc = new Scanner(System.in);

    void patientsinfo() {
        System.out.println("************ Patients Info ************");
        
        System.out.print("Enter patient number: ");
        pNumber = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        
        System.out.print("Enter patient name: ");
        pName = sc.nextLine();
        
        System.out.print("Enter patient age: ");
        pAge = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        
        System.out.print("Enter patient Email: ");
        pEmail = sc.nextLine();
        
        System.out.print("Enter patient Contact number: ");
        pContact = sc.nextDouble();
        sc.nextLine(); // Clear the buffer
        
        System.out.print("Enter patient complaint: ");
        pComplaint = sc.nextLine(); // Fixed variable usage
        
        System.out.print("Enter patient bill: ");
        pBill = sc.nextInt();
    }

    void printreceipt() {
        System.out.println("************ Patient Receipt ************");
        System.out.println("Patient number: " + pNumber);
        System.out.println("Patient name: " + pName);
        System.out.println("Patient age: " + pAge);
        System.out.println("Patient Email: " + pEmail);
        System.out.println("Patient Contact number: " + pContact);
        System.out.println("Patient complaint: " + pComplaint);
        System.out.println("Patient bill: " + pBill);
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.patientsinfo();
        p.printreceipt();
    }
}

        
    

