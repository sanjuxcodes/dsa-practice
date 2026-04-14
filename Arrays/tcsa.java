import java.util.*;
public class tcsa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        int pvmax=arr[0];
        int c=1;

        for(int i=1;i<n;i++){
            if(arr[i]>pvmax){
                c++;
                pvmax=arr[i];
            }
        }

        System.out.println(c);

        
    }
    
}
