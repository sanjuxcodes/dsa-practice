public class lowerbound {
    static int found(int arr[],int t){

        int n= arr.length;
        int ans =n;
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid= (low+high)/2;
            
            if(arr[mid]>=t){
                ans=mid;
                high=mid-1;

            }

            else
                low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,3,3,4,8,9};
        System.out.print(found(arr, 2));
    }
}
