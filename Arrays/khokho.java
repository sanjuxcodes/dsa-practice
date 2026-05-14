

import java.util.Arrays;
import java.util.Scanner;
public class khokho {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }

        int arr[]= new int[n];
        int mrr[]= new int[n];
        Arrays.fill(mrr,0);


        

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
            int c=0;
        for(int i=0;i<n-1;i++){

            if(arr[i]==arr[0]){
                c+=1;
                
            }
            

        }
        System.out.println(n-c);
        
    }
    
}
