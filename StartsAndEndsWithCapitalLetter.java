import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String userPattern = ("\\b[A-Z][a-zA-Z]*[A-Z]\\b|\\b[A-Z]\\b");
        Pattern p;
        Matcher m;
        p = Pattern.compile(userPattern);
        m = p.matcher(str);
        while (m.find()) {
            System.out.printf(str.substring(m.start(), m.end()) + " ");
        }


    }
}
