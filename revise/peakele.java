import java.util.Scanner;
public class peakele {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();


        }

        if(arr[0]>arr[1]){
            System.out.print(arr[0]);


        }
        if(arr[n-1]>arr[n-2]){
            System.out.print(arr[n-1]);

        }

        int l=1;
        int h=n-2;

        while(l<=h){
            int mid=(l+h)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                System.out.print(arr[mid]);
            }
            if(arr[mid]>arr[mid-1]){
                l=mid+1;
            }else{
                h=mid-1;
            }

        }

    }
}
