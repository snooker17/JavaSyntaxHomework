import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomizeNToM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int founding=scanner.nextInt();
        int limit=scanner.nextInt();
        if(founding>limit){
            int temp=limit;
            limit=founding;
            founding=temp;
        }
        Random rand=new Random();
            Set<Integer> randNum = new LinkedHashSet<Integer>();
            while (randNum.size() < limit-founding+1)
            {
                Integer next = rand.nextInt(limit-founding+1) + founding;
                randNum.add(next);
            }
        for (Integer num:randNum) {
            System.out.println(num);
        }
        }
}

