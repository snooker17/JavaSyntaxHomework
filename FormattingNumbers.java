import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();

        String aInBinaryString = Integer.toBinaryString(a);
        int aInBinary = Integer.parseInt(aInBinaryString);

        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|",a,aInBinary,b,c);
    }
}
