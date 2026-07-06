import java.util.Scanner;
public class subs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ip =sc.nextLine();

        int t= sc.nextInt();
        sc.nextLine();

        String[] parts=ip.split("\\s+");

        int arr[]= new int[parts.length];

        for(int i =0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);

        }

        int l=0;
        int r=1;
        int n=arr.length;
        int sum=arr[0];
        int len=-1;

        while(r<n){
            sum+=arr[r];

            if(sum==t){
                len=Math.max(len,r-l+1);

            }
            while(l<n && sum>t){
                sum-=arr[l];
                l++;

            }
            r++;

        }

        System.out.print(len);




    }
    
}
