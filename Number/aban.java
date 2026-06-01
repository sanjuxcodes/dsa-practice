import java.util.Scanner;
public class aban {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s=0;


        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                s+=i;

            }

        }
        if(s>n){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
    
}
