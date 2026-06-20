public class insertion {
    static void swp(int arr[],int a ,int b){
        
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public static void main(String[] ar){
        int arr[]= {2,4,3,1};

        int n=arr.length;

        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){

                swp(arr,j,j-1);
                j--;

            }
        }

        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
    
}
