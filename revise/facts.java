import java.util.Scanner;
public class facts {


    static int gcd(int a,int b){


        if(b==0){
            return a;
        }

        return gcd(b,a%b);
    }

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();

        int c=sc.nextInt();

        int d = sc.nextInt();

        int x= a*d+c*b;

        int y=b*d;

        System.out.print(x/gcd(x,y) + " "+y/gcd(x,y));



    }
    
}
