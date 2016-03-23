import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ExtractWords {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        String inserted=scanner.nextLine();
        String userPattern="[a-zA-Z_]+";
        Pattern p;
        Matcher m;
        p=Pattern.compile(userPattern);
        m=p.matcher(inserted);
        while ( m.find() ) {
            System.out.printf(inserted.substring(m.start(), m.end())+" ");
        }

    }
}
