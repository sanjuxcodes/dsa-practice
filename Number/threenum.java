import java.util.Arrays;
import java.util.Scanner;

public class threenum {

    static boolean issm(int a, int b, int c) {
        return a == b && b == c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        int c = 0;

        // limit iterations
        for (int i = 0; i < 1000; i++) {

            Arrays.sort(arr);

            if (issm(arr[0], arr[1], arr[2])) {
                System.out.println(c);
                return;
            }

            arr[0]++;
            arr[1]++;
            arr[2]--;

            c++;
        }

        System.out.println(-1);
    }
}