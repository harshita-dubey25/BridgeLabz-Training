import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmeticCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);
        System.out.println("Original Date : " + date);
        LocalDate plusDays = date.plusDays(7);
        System.out.println("After adding 7 days : " + plusDays);
        LocalDate plusMonths = plusDays.plusMonths(1);
        System.out.println("After adding 1 month : " + plusMonths);
        LocalDate plusYears = plusMonths.plusYears(2);
        System.out.println("After adding 2 years : " + plusYears);
        LocalDate finalDate = plusYears.minusWeeks(3);
        System.out.println("After subtracting 3 weeks : " + finalDate);

    }
}
