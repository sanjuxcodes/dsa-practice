
import java.util.Scanner;
public class miss {

    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int s=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];

        }
        int sum= (n*(n+1))/2;

        System.out.print(sum-s);



    }
    
}
