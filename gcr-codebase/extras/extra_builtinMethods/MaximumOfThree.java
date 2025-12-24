import java.util.Scanner;
public class MaximumOfThree {
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        return numbers;
    }
    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
    public static void main(String[] args) {

        int[] nums = getInput();
        int max = findMaximum(nums[0], nums[1], nums[2]);

        System.out.println("Maximum of the three numbers is: " + max);
    }
}
