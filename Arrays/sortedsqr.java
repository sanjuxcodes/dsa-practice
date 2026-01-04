public class sortedsqr {
    
        public static void sortedSquares(int[] nums) {
            int n= nums.length;
    
            int []ans=new int[n];
            int low=0;
            int high=n-1;
    
            int pos=n-1;
    
            while(low<=high){
            
    
            if(Math.abs(nums[low])<Math.abs(nums[high])){
                ans[pos]=nums[high]*nums[high];
               
                high--;
    
            }
            else{
                ans[pos]=nums[low]*nums[low];
                low++;}
    
            pos--;
                
    
            }
    
            
        for(int i =0; i<n;i++){
            System.out.println(ans[i]);

        }
    
    
        
    
    }
    public static void main(String[] args) {
        int arr[]={-1,-4,-5,10,18};
        
        sortedSquares(arr);
    }
}
