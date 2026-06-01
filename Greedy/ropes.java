import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class ropes {

    public static void main(String[] args){


        PriorityQueue<Integer> pq= new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());


        }
        int c=0;
        ArrayList<Integer> list= new ArrayList<>();


        while(pq.size()>1){

            int f=pq.poll();
            int s=pq.poll();
            //int sm=f+s;
            c+=f+s;
            pq.add(f+s);
            list.add(c);


        }
        System.out.print(c);
        //System.out.print(list);
        


    }
    
}
