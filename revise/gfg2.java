import java.util.Arrays;
import java.util.Scanner;

public class gfg2 {

    public static void main(String ar[]){

        Scanner sc = new Scanner(System.in);


        String ip = sc.nextLine();

        String[] part=ip.split(" ");




        int n = part.length;

        int arr[]=  new int[n];

        for(int i=0;i<n;i++){


            arr[i]= Integer.parseInt(part[i]);



        }
        
        Arrays.sort(arr);
        
        if(n%2==1){
            
         System.out.print(arr[n/2]);
            
        }
       double r= arr[n/2]+arr[(n/2)-1];
       
      System.out.print(r/2);
    }
    
}
