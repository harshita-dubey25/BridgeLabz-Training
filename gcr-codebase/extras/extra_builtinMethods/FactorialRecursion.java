import java.util.Scanner;
public class FactorialRecursion {
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {   
            return 1;
        }
        return n * factorial(n - 1); 
    }
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " = " + result);
    }
    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }
}
