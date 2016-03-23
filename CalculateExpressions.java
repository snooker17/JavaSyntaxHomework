import java.util.Scanner;
public class CalculateExpressions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();

        double formulaOne=(Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2));
        double formulaOneHelp=(a+b+c)/Math.sqrt(c);

        double resultOne=Math.pow(formulaOne,formulaOneHelp);

        double resultTwo=Math.pow(Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3),a-b);

        double averageABC=(a+b+c)/3;
        double averageFormulae=(resultOne+resultTwo)/2;
        double averageResult=averageFormulae-averageABC;

        System.out.printf("F1 result: %.2f\n",resultOne);
        System.out.printf("F2 result: %.2f\n",resultTwo);
        System.out.printf("Diff : %.2f\n",averageResult);

    }
}
