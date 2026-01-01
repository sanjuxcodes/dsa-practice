public class searchrotatedsortedarr {
    
        public static  int search(int[] nums, int target) {
            int n= nums.length;
    
            int st=0;
            int end=n-1;
    
            while(st<=end){
                int mid =st+(end-st)/2;
    
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[st]<=nums[mid])
                {//ls
                    if(nums[st]<=target && target<=nums[mid]){
                    end=mid-1;
    
                    }
                    else{
                        st=mid+1;}
    
                }
                else{
                    //rs
                    if(nums[mid]<=target && target<=nums[end]){
                        st=mid+1;
                    }
                    else
                        end=mid-1;
    
    
                }
                    
    
            }
            return -1;
            
        }
        public static void main(String[] args) {
            int arr[]={3,4,5,6,0,1,2};
            System.out.print(search(arr, 1));
        }
    }


