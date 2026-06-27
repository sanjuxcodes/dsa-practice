import java.util.Scanner;
public class flocc {

    static int lower(int arr[],int x){
        int l=0;
        int h=arr.length-1;

        int lb=-1;
        


        while(l<=h){

            int mid=(l+h)/2;

            if(arr[mid]>=x){
                lb=mid;
                h=mid-1;

            }else{
                l=mid+1;

                
            }

        }
        if(lb==-1 || arr[lb] !=x)
        {
            return -1;
        }else
            return lb;

    }
    static int upper(int arr[],int x){
        int l=0;
        int h=arr.length-1;

        int ub=arr.length;
        


        while(l<=h){

            int mid=(l+h)/2;

            if(arr[mid]>x){
                ub=mid;
                h=mid-1;

            }else{
                l=mid+1;

                
            }
        }
        return ub;

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int x=sc.nextInt();


        int l=0;
        int h=n-1;

        int lb=lower(arr,x);
        int ub=upper(arr,x);


        if(ub>=0 &&lb >=0 ){
        System.out.print(lb+" "+ (ub-1) +" "+((ub-1)-lb));}
        else{
            System.out.print(-1);
        }


    }
    
}
