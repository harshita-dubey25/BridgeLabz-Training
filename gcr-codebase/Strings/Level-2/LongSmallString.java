import java.util.*;
public class LongSmallString {
    public static int sizeStr(String st) {
        int cnt = 0;
        try {
            while (st.charAt(cnt) >= 0) {
                cnt++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return cnt;
        }
        return cnt;
    }
    public static String[] textSplit(String s) {
        String wd = "";
        int size = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                size++;
            }
        }
        String ans[] = new String[size + 1];
        int curr = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (wd.length() != 0) {
                    if (curr < ans.length) ans[curr++] = wd;
                    wd = "";
                }
            } else {
                wd += s.charAt(i);
            }
        }
        if (wd.length() != 0) {
            if (curr < ans.length) ans[curr++] = wd;
        }
        
        return ans;
    }

    public static String[][] convertWordLen(String word[], int size) {
        String ans[][] = new String[size][2];
        for (int i = 0; i < size; i++) {
            
            if (word[i] != null) {
                int len = sizeStr(word[i]);
                ans[i][0] = word[i];
                ans[i][1] = len + "";
            }
        }
        return ans;
    }

    public static String[] smallLarge(String st[][], int size) {
        String firstVal = "";
        for(int i=0; i<size; i++) {
            if(st[i][0] != null) {
                firstVal = st[i][0];
                break;
            }
        }

        String ans[] = {firstVal, firstVal};
        
        for (int i = 0; i < size; i++) {
            if (st[i][0] == null || st[i][1] == null) continue;

            int currentLen = Integer.parseInt(st[i][1]);
            
            if (currentLen < ans[0].length()) {
                ans[0] = st[i][0];
            }
            
            if (currentLen > ans[1].length()) {
                ans[1] = st[i][0];
            }
        }
        return ans;
    }
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        
        if (s == null || s.trim().isEmpty()) {
            System.out.println("No text entered.");
            return;
        }

        String splitWord[] = textSplit(s);
        int size = splitWord.length;
        String wordArr[][] = convertWordLen(splitWord, size);
        
        String ans[] = smallLarge(wordArr, splitWord.length);
        System.out.println("Largest word: " + ans[1]);
        System.out.println("Smallest word: " + ans[0]);
    }
}
