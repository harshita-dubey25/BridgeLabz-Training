import java.util.Scanner;
public class PrimeNumberChecker {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean result = isPrime(number);

        if (result) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
    }
}
