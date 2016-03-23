import java.util.Scanner;

public class ConvertTo10Base {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();
        int[]numberSep=new int[number.length()];
        int result=0;
        int reverseCount=0;
        for (int i = number.length()-1; i >=0 ; i--) {
            numberSep[i]=Character.getNumericValue(number.charAt(reverseCount));
            reverseCount++;

        }
        for (int i = 0; i <numberSep.length ; i++) {
            result+=numberSep[i]*Math.pow(7,i);
        }


        System.out.println(result);

    }


}
