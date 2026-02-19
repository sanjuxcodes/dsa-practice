public class selectionSort {

    static void swap(int arr[],int i,int j ){
        int t=arr[i];
        arr[i]=arr[j];

        arr[j]=t;

    }

    void sortit(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){

            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }

            swap(arr,i,minidx);


        }
    }
    
}
