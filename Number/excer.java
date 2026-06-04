import java.util.Scanner;
public class excer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n=7.00;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=sc.nextInt();

        }
        System.out.print("ttl : "+sum +"(min)");
        System.out.print("avg: "+ Math.ceil(sum/n));

    }
}
