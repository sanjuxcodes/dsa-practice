import java.util.Scanner;
public class luckyno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<1000 || n==0 || n>9999){
            System.out.print(n+ "Is invalid no.");
            return;

        }
        int s=0;

        while(n>0){
            int d = n%10;
            s+=d;
            n/=10;
        }
        if(n % 3 ==0|| n% 5==0|| n%7==0 ){
            System.out.print( "Lucky no");

        }else{
            System.out.print("ISorry its not my lucky number");
        }
    }
}
