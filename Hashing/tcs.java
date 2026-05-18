import java.util.*;
public class tcs {

    public static void main(String[] args){
        int[] arr={3,1,2};
        int trr[]={1,2,3};
        HashMap<Integer,Queue<Integer>> ls= new HashMap<>();
        
        for(int i=0;i<trr.length;i++){
            ls.putIfAbsent(trr[i], new LinkedList<>());
            ls.get(trr[i]).offer(i);



            
        }

        int c=0;

        
        

        for(int i=0;i<arr.length;i++){
            arr[i]=ls.get(arr[i]).poll();

           
        }
        for (int i = 0; i <arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    c++;
                }

            }
            
        }

        System.out.println(c);
    }
    
}
