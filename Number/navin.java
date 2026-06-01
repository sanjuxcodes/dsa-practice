import java.util.Scanner;
public class navin {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n= sc.nextLong();
        long m=n;
        int s=0;

        while(n>0){

            long x= n%10;
            s+=(int)x;
            n/=10;




        }

        if((int)m%s==0){
            System.out.print("yes");


        }else{
            System.out.print("no");
        }
    }
    
}
