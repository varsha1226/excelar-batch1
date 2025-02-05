import java.util.Scanner;

class demo07 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter phone number: ");
        long phone = scanner.nextLong();

        System.out.println("Hi, my name is " + username + ", my age is " + age + ", and my phone number is " + phone + ".");

        scanner.close(); 
    }
}