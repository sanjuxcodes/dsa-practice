public class lenOfLongestSubArraySumK {
    
//for postive val. only
        public static int maxSubarrayLength(int[] nums, int k) {
            int l = 0, sum = 0, maxLen = 0;
    
            for (int r = 0; r < nums.length; r++) {
                sum += nums[r];
    
                while(sum > k) {
                    sum -= nums[l];
                    l++;
                }
    
                if (sum == k) {
                    maxLen = Math.max(maxLen, r - l + 1);
                }
            }
            return maxLen;
        }
    

    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        
        System.out.println("max len. of subarray should be : "+ maxSubarrayLength(arr, 15));
        
    }
    
    
}
