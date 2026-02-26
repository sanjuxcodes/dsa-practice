
import java.util.HashMap;

public class twosum {

    static int[] findd(int arr[],int target){

        HashMap <Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int needed= target-arr[i];
            if(map.containsKey(needed)){
                return new int[]{i,map.get(needed)};
            }
            else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,3,4,0,4};

        int [] res=findd(arr, 8);
        
        System.out.print(res[0]+" "+res[1]);
    }
}
