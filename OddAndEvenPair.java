import java.util.Scanner;

public class OddAndEvenPair {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] chars=str.split(" ");
        if(chars.length%2!=0) {
            System.out.println("Invalid length");
        }else{

        int[] numbers=new int[str.length()];

        for (int i = 0; i < chars.length; i++) {
            numbers[i] = Integer.parseInt(chars[i]);
        }
            for (int i = 0; i < chars.length; i+=2) {
                if(numbers[i]%2==0&&numbers[i+1]%2==0) {
                    System.out.printf("%d, %d -> both are even\n", numbers[i], numbers[i + 1]);
                }else if (numbers[i]%2!=0&&numbers[i+1]%2!=0) {
                    System.out.printf("%d, %d -> both are odd\n", numbers[i], numbers[i +1]);
                }else{
                System.out.printf("%d, %d -> different\n",numbers[i],numbers[i+1]);
                }
            }

        }
    }
}
