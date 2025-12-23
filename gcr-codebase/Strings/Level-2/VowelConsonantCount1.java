import java.util.*;
public class VowelConsonantCount1{
    public static String consoVow(char ch) {
        int ascii = (int) ch;

        if (ascii >= 65 && ascii <= 90) {
            ch = (char) (ascii + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] consoVowArray(String s) {
        String[][] data = new String[s.length()][2];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            data[i][0] = String.valueOf(ch); 
            data[i][1] = consoVow(ch);       
        }
        return data;
    }

    
    public static void displayTable(String[][] table) {
        int vowCount = 0;
        int conCount = 0;

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0]+" "+ table[i][1]);
            
            if (table[i][1].equals("Vowel")) vowCount++;
            else if (table[i][1].equals("Consonant")) conCount++;
        }

        System.out.println("Total Vowels: " + vowCount);
        System.out.println("Total Consonants: " + conCount);
    }
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine(); 
        
        String[][] results = consoVowArray(s);

        displayTable(results);
    }
}