import java.util.Scanner;
public class ConvertTo7Sys {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numbero = scanner.nextInt();
            convertNum(numbero);
    }

    static void convertNum(int number) {
            if(number>0){
                convertNum(number/7);
                System.out.print(number%7);
            }
    }




}

