import java.util.*;
public class frstocc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();



    LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();



    for(int i=0;i<n;i++){
        int k=sc.nextInt();
        
        map.put(k,map.getOrDefault(k,0)+1);

    }

    for(int x : map.keySet()){
        if(map.get(x)==1){
            System.out.print(x);
            return;
        }
    }
    System.out.print(-1);


    
    
    }
    
}
