import java.util.Scanner;
public class ConvertTo7SysSecondVar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberToConv=scanner.nextInt();
        String result=Integer.toString(numberToConv,7);
        System.out.println(result);
    }
}
