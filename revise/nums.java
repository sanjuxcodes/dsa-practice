import java.util.Scanner;
public class nums {

    static int gcd(int a,int b){

        if(b==0){
            return a;
        }



        return gcd(b , a%b);
    }

    static int lcm(int a, int b){

        return (a*b)/gcd(a,b);
    }

    public static void main(String[] aee){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m= sc.nextInt();


        System.out.print(gcd(n,m));



    }
}
