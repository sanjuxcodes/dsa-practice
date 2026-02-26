
import java.util.HashMap;
//have to return num of subarrays reaching target sum
public class targetsum {
    static int findd(int arr[],int t){

        HashMap<Integer,Integer> map=new HashMap<>();
        int currsum=0;
        int count=0;
        int needed=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];

            needed=currsum-t;

            if(map.containsKey(needed)){
                count+=map.get(needed);
            }

            map.put(currsum,map.getOrDefault(currsum, 0)+1 );

            



        }
        return count;
    }
    
}
