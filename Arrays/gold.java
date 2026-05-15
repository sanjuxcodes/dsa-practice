import java.util.*;
public class gold {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]= new int[n];

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int sum=0;
        for(int r=0;r<n;r++){

            sum+=arr[r];

            
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum==k){
                System.out.print(l+1 +" "+ (r+1));
                break;
            }
            




        }
    }
    
}
