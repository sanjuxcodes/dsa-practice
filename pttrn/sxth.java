import java.util.Scanner;
public class sxth {

    public static void main(String[] aa){
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();

        while(t>0){
            int r=sc.nextInt();

            for(int i =r;i>0;i--){
                for(int j =0;j<=r-i;j++){
                    System.out.print(" ");
                }
                for(int k=2*i-1;k>0;k--){
                    System.out.print("*");
                }
                for(int j =0;j<=r-i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }

            t--;

        }
    }
    
}
