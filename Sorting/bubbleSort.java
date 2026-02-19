

public class bubbleSort {

    static void swap(int arr[] ,int i ,int j){
        
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    int[] sortit(int arr[]){

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j, j+1);


                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={4,1,2,3,0};
        bubbleSort a= new bubbleSort();
        a.sortit(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
