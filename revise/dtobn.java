import java.util.Scanner;
public class dtobn {


    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder bn = new StringBuilder();

        if(n==0){
            System.out.print(0);
            return;

        }

        while(n>0){
            bn.append(n%2);
            n=n/2;





        }
        System.out.print(bn.reverse().toString());
    }
    
}
