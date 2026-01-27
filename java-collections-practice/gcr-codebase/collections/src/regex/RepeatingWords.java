package regex;

import java.util.regex.*;
import java.util.*;

public class RepeatingWords {
    public static void main(String[] args) {

        String input = "This is is a repeated repeated word test.";

        // Regex to find repeating words
        String regex = "(?i)\\b(\\w+)\\b\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        Set<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1).toLowerCase());
        }

        System.out.println(String.join(", ", repeatedWords));
    }
}
