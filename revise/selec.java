public class selec {
    static void swap(int arr[],int a,int b ){

        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;

    }
    public static void main(String[] ac){
        int arr[]={3,1,4,2};

        int n =arr.length;

        for(int i=0;i<n-1;i++){
            int min=i;

            for(int j=i+1;j<n;j++){

                if(arr[j]<arr[min]){
                    min=j;

                }

            }
            swap(arr,min,i);

        }

        for(int i: arr){
            System.out.print(i +" ");
        }
    }
    
}
