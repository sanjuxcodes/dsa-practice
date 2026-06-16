import java.util.HashMap;
import java.util.Scanner;
public class sum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k= sc.nextInt();


        map.put(0,-1);
        int curr=0;
        int l=0;

        for(int i: arr){
            curr=curr+i;

            if(map.containsKey(curr-k)){
                System.out.print("YES");
                return;


            }
            map.put(curr,l);
            l++;
            
        }
        System.out.print("NO");


    }
    
}
