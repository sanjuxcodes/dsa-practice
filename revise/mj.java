import java.util.HashMap;
import java.util.Scanner;
public class mj {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];

        HashMap<Integer,Integer> map=new HashMap<>();


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])>n/2){
                System.out.print(arr[i]);
                return;

            }
            
        }
    }
    
}
