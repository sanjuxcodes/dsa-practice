import java.util.Scanner;
public class arm {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        int p= ip.length();

        int n = Integer.parseInt(ip);
        int l =n;

        int sum=0;
        


        while(n>0){

            int a = n%10;
            sum+=Math.pow(a,p);
            n/=10;

        }
        if(l==sum){
            System.out.print("true");

        }else{
            System.out.print("False");
        }
        
    }
    
}
