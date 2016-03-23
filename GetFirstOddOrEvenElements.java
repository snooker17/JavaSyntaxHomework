import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] firstLineIn=scanner.nextLine().split(" ");
        int[] numbers=new int[firstLineIn.length];
        int numberCounter=0;
        for (int i = 0; i < firstLineIn.length; i++) {
            numbers[i]=Integer.parseInt(firstLineIn[i]);
        }

        String[] secondLineIn=scanner.nextLine().split(" ");
        int numToGet=Integer.parseInt(secondLineIn[1]);


        for (int i = 0; i <numbers.length ; i++) {
            if ((numbers[i]%2!=0)&&(secondLineIn[2].equals("odd"))){
                numberCounter++;
                System.out.print(numbers[i]+" ");
            }else if ((numbers[i]%2==0)&&(secondLineIn[2].equals("even"))){
                numberCounter++;
                System.out.print(numbers[i]+" ");
            }

            if (numberCounter==numToGet){
                break;
            }
        }








    }
}
