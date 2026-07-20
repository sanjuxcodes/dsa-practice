import java.util.Arrays;
import java.util.Scanner;

public class cz3 {

    public static int maxPeopleInLift(int input1, int tc, int[] wt) {

        // Write your logic here
        Arrays.sort(wt);
        int cw=0;
        int c=0;
        for(int i : wt){
            cw+=i;
            c++;
           if(cw>tc){
            return --c;
           }
        }
        

        return input1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt(); // Number of people
        int input2 = sc.nextInt(); // Lift capacity

        int[] input3 = new int[input1];

        for (int i = 0; i < input1; i++) {
            input3[i] = sc.nextInt();
        }

        System.out.println(maxPeopleInLift(input1, input2, input3));

        sc.close();
    }
}