import java.util.HashMap;
import java.util.Scanner;

class hsi{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        char arr[]= new char[n];
        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i]=sc.next().toLowerCase().charAt(0);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


        

        for(int i=0;i<n;i++){
            if(map.get(arr[i])%2==1){
                System.out.println(arr[i]);
                return;
            }
                
        }
        System.out.println("all even");return;
            





        
    }
}