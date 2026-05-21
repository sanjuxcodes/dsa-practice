import java.util.*;
public class ser {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();


        if(n<=0){
            System.out.println("invalid");
            return;

        }
        if(n==1 || n==2){
            System.out.println(0);
            return;
        }

        if(n%2==1){

            System.out.println(n-1);

        }else{
            System.out.println((n-1)/2);
        }


    }
    
}
