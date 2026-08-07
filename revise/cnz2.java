import java.util.Scanner;

public class cnz2{

    public static int[] finalPetrol(int input1, int input2, int[] input3, int[] input4) {

        // Write your logic here
        
        int m = (int)Math.pow(2,input1);

        for (int i = 0; i < input4.length; i++) {

            if(input4[i]==1){
                input3[i]*=m;
            }
            
        }

        return input3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of visits
        int input1 = sc.nextInt();

        // Size of arrays
        int input2 = sc.nextInt();

        // Petrol array
        int[] input3 = new int[input2];
        for (int i = 0; i < input2; i++) {
            input3[i] = sc.nextInt();
        }

        // Availability array
        int[] input4 = new int[input2];
        for (int i = 0; i < input2; i++) {
            input4[i] = sc.nextInt();
        }

        int[] ans = finalPetrol(input1, input2, input3, input4);

        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i != ans.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}