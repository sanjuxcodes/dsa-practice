import java.util.Scanner;
public class dtob {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String b = Integer.toBinaryString(n);
        System.out.print(b);
    }
    
}
