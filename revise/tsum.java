import java.util.HashMap;
import java.util.Scanner;
public class tsum {

    public static void main(String[] a){


        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();


        int arr[]= new int[n];


        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i =0;i<n;i++){

            arr[i]=sc.nextInt();

            map.put(arr[i],i);


        }
        int t=sc.nextInt();

        int h=0;


        for(int i : arr){
            int z= t-i;

            if(map.containsKey(z) && h!=map.get(z)){
                System.out.print(h+" "+map.get(z));
                return ;
            }


        h++;
        }
        System.out.print("no data");



    }
    
}
