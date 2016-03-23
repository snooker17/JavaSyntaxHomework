import java.util.Scanner;
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] wholeInput=scanner.nextLine().split(" ");
        String str1=wholeInput[0];
        String str2=wholeInput[1];
        long result=0;
        int equalCycles=0;
        String biggerString=str2;
        int biggerStringInt=str2.length();
        int smallerStringInt=str1.length();
        if(str1.length()>str2.length()) {
            biggerStringInt = str1.length();
            smallerStringInt=str2.length();
            biggerString=str1;
        }
        equalCycles=smallerStringInt;

        for (int i = 0; i < equalCycles ; i++) {
         result+=str1.charAt(i)*str2.charAt(i);
        }

            for (int i = biggerStringInt-1; i >= smallerStringInt ; i--) {
                result+=biggerString.charAt(i);
            }

        System.out.println(result);
    }
}
