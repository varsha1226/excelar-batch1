import java.util.Scanner;

public class demo009 {
    String Cust_Name = "Prasunamba";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details() {
        System.out.println("Enter your name, account number, and balance:");

        Scanner sc = new Scanner(System.in);

        // Accept user input
        System.out.print("Name: ");
        Cust_Name = sc.nextLine();

        System.out.print("Account Number: ");
        Account_no = sc.nextLong();

        System.out.print("Balance: ");
        Balance = sc.nextDouble();
    }

    void Display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your account number is " + Account_no);
        System.out.println("Your balance is " + Balance);
    }

    public static void main(String[] args) {
        demo009 obj = new demo009();
        obj.accept_details();
        obj.Display_details();
    }
}