import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primefac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        List<Integer> list= new ArrayList<>();


        for(int i=2;i*i<=n;i++){

            
            while(n%i ==0){
                System.out.println(i);
                
             
                n=n/i;
                
                
            }

        }
        
    }
    
}
