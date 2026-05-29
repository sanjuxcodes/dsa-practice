import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class freqsort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Integer arr[]= new Integer[n];
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        Arrays.sort(arr,(a,b)->{

            int fa=map.get(a);
            int fb=map.get(b);

            if(fa!=fb){
                return fb-fa;

            }
            return a-b;

        });

        for(Integer i: arr){
            System.out.print(i+ " ");
        }


    
        

        
    }
    
}
