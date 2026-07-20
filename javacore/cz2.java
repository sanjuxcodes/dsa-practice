import java.util.Scanner;

public class cz2{

    public static int completeBookshelves(int input1, int input2, int[] input3,int t) {



        // Write your logic here
        



        return t/input2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt(); // Number of students
        int input2 = sc.nextInt(); // Shelf capacity

        int[] input3 = new int[input1];
        int t=0;
        for (int i = 0; i < input1; i++) {
            input3[i] = sc.nextInt();
            t+=input3[i];


        }

        System.out.println(completeBookshelves(input1, input2, input3,t));

        sc.close();
    }
}