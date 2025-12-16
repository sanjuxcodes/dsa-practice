public class leftRotatebyD{
    public static void rotate(int arr[],int d){
        int n= arr.length;
        d=d%n; //to normalize rotation num.

        int temp[]= new int[d];

        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];

        }

        int j=0;

        for(int i=n-d;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("shifted arr: ");
        rotate(arr, 3);

        
    }
}