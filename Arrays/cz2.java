import java.util.*;
public class cz2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x =sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=i+1;

        }

        int brr[]= new int[arr.length];
        brr[arr.length-1]=arr[0]+arr[n-1];
        int s=0;
        for(int i =0;i<n-1;i++){
            brr[i]=arr[i]+arr[i+1];
            if(brr[i]%x==0){
                s+=brr[i];
            }
        }
        if(brr[n-1]%x==0){
            s+=brr[n-1];
    System.out.print(s);
        
    
    
}
}