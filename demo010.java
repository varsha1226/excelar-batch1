import java.util.Scanner;

class Customer {
    String Cust_Name = "Prasunamba";
    long Account_no = 123456;
    double Balance = 10000.00;

    // Method to accept customer details
    void accept_details() {
        System.out.println("Enter your name and account number:");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
    }

    // Method to display customer details
    void Display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your account number: " + Account_no);
        System.out.println("Your balance is: " + Balance);
    }
}

public class demo010 {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}