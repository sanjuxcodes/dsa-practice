public class singleeleSortedarr {
   
        public static int singleNonDuplicate(int[] nums) {
            int n = nums.length;
    
            if (n == 1) {
                return nums[0];
            }
    
            int low = 1;
            int high = n - 2;
            if(nums[low]!=nums[low-1]){
                return nums[low-1];
    
            }
            if(nums[high]!=nums[high+1]){
                return nums[high+1];
            }
    
            while (low <= high) {
    
                int mid = low + (high - low) / 2;
    
                // check if mid itself is the single element
                if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                }
    
                // left side is correct, single element on right
                if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
    
                    low = mid + 1;
                }
                // right side is correct, single element on left
                else {
                    high = mid - 1;
                }
            }
    
            // when loop ends, low will point to the single element
            return nums[low];
        }
        public static void main(String[] args) {
            int arr[]={1,2,2,3,3,4,4};
            System.out.println(singleNonDuplicate(arr));
        }
    }
    
