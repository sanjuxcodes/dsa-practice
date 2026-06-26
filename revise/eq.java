import java.util.*;
public class eq {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];
        int ts=0;

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            ts+=arr[i];


        }

        int ls=0;
      



        for(int i =0;i<n;i++){
            int rs=0;
           
            rs=ts-ls-arr[i];
            if(ls==rs){
                System.out.print(i);
                return;
            }
            ls+=arr[i];
        }
            System.out.print(-1);
            
        

        
    }
    
}
