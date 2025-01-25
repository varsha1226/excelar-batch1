import java.util.Scanner;

public class demo022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter monthly HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter monthly PF: ");
        double pf = scanner.nextDouble();

        double annualSalary = monthlySalary * 12;
        double annualHRA = hra * 12;
        double annualPF = pf * 12;

        double deductions = annualHRA + annualPF;
        double taxableIncome = annualSalary - deductions;

        double tax = 0;
        if (taxableIncome > 1000000) {
            tax += (taxableIncome - 1000000) * 0.30;
            taxableIncome = 1000000;
        }
        if (taxableIncome > 500000) {
            tax += (taxableIncome - 500000) * 0.20;
            taxableIncome = 500000;
        }
        if (taxableIncome > 0) {
            tax += taxableIncome * 0.10;
        }

        System.out.println("Annual Income Tax: Rs " + tax);

        scanner.close();
    }
}