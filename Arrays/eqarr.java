
import java.util.Scanner;

public class eqarr {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        int curr=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            curr+=arr[i];

        }

        
        int lsum=0;
        for(int i=0;i<n;i++){

            int right=curr-lsum-arr[i];

            if(right==lsum){
                System.out.println(i);
                return;

            }
            lsum+=arr[i];



        }
        System.out.println(-1);


    }
    
}
