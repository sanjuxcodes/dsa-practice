public class missingNum {
    public static int missingNumber(int[] arr) {
        int n= arr.length;

        int sum = (n*(n+1))/2;
        int s1=0;

        for(int i =0;i<n;i++){
            s1+=arr[i];
        }

        return sum-s1;


        
    }

    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println("missing no is : "+ missingNumber(arr));
        
    }
    
}
