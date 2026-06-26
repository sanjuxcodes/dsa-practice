import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class longsqnc {

    public static void main(String[] ar){


        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(sc.nextInt());

        }
      
        int c=1;
        int mc=1;
        for(int x: set){

            int y=x;
            

            while(set.contains(y+1)){
                c++;
                y++;
                
            }
            mc=Math.max(mc,c);
            c=1;
           
        }

        System.out.print(mc);

      




    }
    
}
