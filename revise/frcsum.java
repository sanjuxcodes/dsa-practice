import java.util.Scanner;
public class frcsum {


    static int gcd(int a,int b){
        if(b==0){
            return a;

        }
        return gcd(b,a%b);
    }

    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] arr){

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        String parts[]= ip.split(",");

        String f1[]=parts[0].split("/");
        String f2[]=parts[1].split("/");

        int a=Integer.parseInt(f1[0])*Integer.parseInt(f2[1]);
        int b = Integer.parseInt(f2[0])*Integer.parseInt(f1[1]);

        int c= Integer.parseInt(f1[1])*Integer.parseInt(f2[1]);

        int d =gcd(a+b,c);

        int x= (a+b)/d;
        int y= c/d;

        //System.out.print(d);

        System.out.print(x+"/"+y);



    }
    
}
