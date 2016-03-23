import javax.script.ScriptContext;
import java.util.Scanner;


public class TriangleArea {
    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);

        String stringA=scanner.nextLine();
        String[] pointArr=stringA.split(" ");
        String stringB=scanner.nextLine();
        String[] pointBrr=stringB.split(" ");
        String stringC=scanner.nextLine();
        String[] pointCrr=stringC.split(" ");

        int ax=Integer.parseInt(pointArr[0]);
        int ay=Integer.parseInt(pointArr[1]);
        int bx=Integer.parseInt(pointBrr[0]);
        int by=Integer.parseInt(pointBrr[1]);
        int cx=Integer.parseInt(pointCrr[0]);
        int cy=Integer.parseInt(pointCrr[1]);

        long triangleArea=Math.abs((ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2);

        if (triangleArea>0) {
            System.out.println(triangleArea);
        }
        else {
            System.out.println(0);
        }


    }
}
