

import java.util.Scanner;
public class cz6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];
        int lsum=0;
        int rsum=0;

        for(int i =0;i<n;i++){
            

            arr[i]=sc.nextInt();

            if(i<n/2){
                lsum+=arr[i];

            }
            else
                rsum+=arr[i];


        }
        if(n%2==1){
            rsum-=arr[n/2];
        }
        if(lsum<rsum){
            for(int i=n-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }else{
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

        }

        //1234
        //12345


       

        


    }
}
