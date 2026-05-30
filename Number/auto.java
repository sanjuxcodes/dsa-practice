import java.util.*;
public class auto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=n;
        long r= n*n;
        int i=0;
        long x=0;
        int y=0;

        int c=0;
        while(m>0){

            m/=10;
            c++;
            

        }


        while(i<c){

            x=10*x+r%10;
            r/=10;

            y=10*y+n%10;
            n/=10;

            


            i++;
        }
        if(x==y){
            System.out.println("yes");
            return;
        }
        System.out.println("no");


    }
    
}
