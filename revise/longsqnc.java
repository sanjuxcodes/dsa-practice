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
        ArrayList<Integer> list = new ArrayList<>(set);

        
        Collections.sort(list);
        int c=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)-list.get(i-1)==1){
                c++;
            }
        }

        System.out.print(c);



    }
    
}
