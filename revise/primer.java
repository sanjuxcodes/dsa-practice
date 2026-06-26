import java.util.Scanner;
public class primer {
    static boolean isprm(int n){

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;

            }
        }

        return true;
    }

    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        for(int i=2;i<=n;i++){
            if(isprm(i)){
                System.out.println(i);
            }
        }


    }
    
}
