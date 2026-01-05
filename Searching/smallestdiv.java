

public class smallestdiv {
    
        static int sumofd(int arr[],int d){
            int s=0;
            for(int i =0;i<=arr.length-1;i++){
                s += (arr[i] + d - 1) / d;  
    
            }
            return s;
        }
        static int getmax(int arr[]){
            int m =arr[0];
    
            for(int i=0;i<=arr.length-1 ;i++){
                if(arr[i]>m){
                    m=arr[i];
                }
                
            }
            return m;
        }
        public static int smallestDivisor(int[] nums, int threshold) {
    
            int low=1;
            int high=getmax(nums);
            int ans=-1;
    
            while(low<=high){
                int mid=(low+high)/2;
    
                if(sumofd(nums,mid)<=threshold){
                    ans=mid;
                    high=mid-1;
    
                }
                else
                    low=mid+1;
    
                
            }
            return ans;
            
        }
        public static void main(String[] args) {
            int arr[]={1,2,5,9};
            System.out.print(smallestDivisor(arr, 6));

        }
    }
    
