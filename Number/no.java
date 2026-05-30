import java.util.*;
public class no {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while(n>0){
            int x = n%10;

            max=Math.max(x,max);

            min= Math.min(x,min);
            n/=10;


        }
        System.out.println("largest no is : "+max);
        System.out.println("smallest no is: "+min);
    }
    
}
