import java.util.Scanner;
public class PalindromeChecker {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }
    public static void main(String[] args) {

        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
