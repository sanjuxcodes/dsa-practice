
import java.util.Scanner;

public class security {
    static void swap(int arr[],int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n ;i++){

            arr[i]=sc.nextInt();
        }

        int left=0;
        int right=arr.length-1;
        int mid =0;

      while(mid<=right){
        if(arr[mid]==0){
            swap(arr,left,mid);
            left++;
            mid++;


        }

        else if(arr[mid]==1){
            mid++;
        }
        else{
            swap(arr,mid,right);
          
            right--;
        }
      }
      System.out.println("array : ");
      for(int i: arr){
        System.out.println(i);
      }

        
    }
    
}
