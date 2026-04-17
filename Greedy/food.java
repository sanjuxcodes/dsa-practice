import java.util.*;
public class food {

    public static void main(String[] args) {

        PriorityQueue<long[]> mh= new PriorityQueue<>((a,b) -> Long.compare(b[0], a[0]));//formaxheap

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long m=sc.nextLong();

        long v[]=new long[n];
        long d[] = new long[n];

        for(int i=0;i<n;i++){
            v[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            d[i]=sc.nextLong();
        }

        for(int i=0;i<n;i++){
            mh.add(new long[]{v[i],d[i]});
        }


        long ans=0;
        while(m>0 && !mh.isEmpty()){
            long curr[]=mh.poll();
            if(curr[0]<=0) break;

            ans+=curr[0];

            curr[0]=curr[0]-curr[1];



            if(curr[0]>0){
            mh.add(curr);}
            
            m--;



        }

        System.out.print(ans);
    }
    
}
