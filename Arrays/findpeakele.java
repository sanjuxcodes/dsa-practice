public class findpeakele {

        public static  int findPeakElement(int[] nums) {
            int n = nums.length;
    
            int low = 1;
            int high=n-2;
            int mid;
            if(n==1){
                return 0;
            }
    
            if(nums[low-1]>nums[low]){
                return low-1;
            }
            if(nums[n-1]> nums[n-2]){
                return n-1;
            }
    
            while(low<=high){
               mid=(low+high)/2;
    
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]>nums[mid-1]){
                    low=mid+1;
                }
                else
                    high=mid-1;
            }
            return -1;
            
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,5,6,11,12,3};
            System.out.println(findPeakElement(arr));
        }
    
}
