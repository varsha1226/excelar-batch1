import java.util.Scanner;

public class demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

       
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_YEAR = 365;

     
        long totalDays = minutes / (MINUTES_IN_HOUR * HOURS_IN_DAY);
        long years = totalDays / DAYS_IN_YEAR;
        long remainingDays = totalDays % DAYS_IN_YEAR;

      
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");

        scanner.close();
    }
}