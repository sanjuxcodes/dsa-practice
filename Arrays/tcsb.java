import java.util.Scanner;
public class tcsb {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        long arr[] = new long[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }

        long sec=Long.MIN_VALUE;
        long max=arr[0];
        

        for(int i =1;i<arr.length;i++){
            if(arr[i]> max){
                sec=max;
                max=arr[i];
            }
             if(sec<arr[i] & max>arr[i]){
                sec=arr[i];
            }
            

        }

        System.out.println(sec);


    }
}
