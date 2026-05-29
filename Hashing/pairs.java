import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class pairs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

       int n= sc.nextInt();
       sc.nextLine();
       int fl=0;

       while(n>0){

        int f=sc.nextInt();
        int s=sc.nextInt();
        sc.nextLine();



    
        if(map.containsKey(s)){
            boolean t=map.get(s).contains(f);
            if(t){
            System.out.println(f +" "+s);
            fl++;}
        }
        map.putIfAbsent(f,new ArrayList<>());
        map.get(f).add(s);


        
        


        n--;
       }

       if(fl==0){
        System.out.print("no pairs");

    }
       

    }
    
}
