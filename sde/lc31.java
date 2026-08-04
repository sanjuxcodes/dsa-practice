class Solution {
    static void swap(int arr[],int i ,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    static void rev(int arr[],int i , int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {

int id=-1;
    for(int i=nums.length-1;i>0;i--){
        if(nums[i]>nums[i-1]){
            //find the partition point(peak)
            id=i-1;
            break;
        }
    }
    if(id==-1){
        //no peak(last permutation to next will be frst permutation )
        // so just rev it
        rev(nums,0,nums.length-1);
         for(int i : nums){
        System.out.print(i);
        return;
    }


    }
    

    for(int i=nums.length-1;i>id;i--){
        //after finding the peak indx just find the next greater ele than it 
        // then just swap it in order to get nxt permutation

        if(nums[i]>nums[id]){
            swap(nums,i,id);
            break;
        }
    }
    // after swap just from next idx reverse the rem part to get the very next permu.
    rev(nums,id+1,nums.length-1);

    for(int i : nums){
        System.out.print(i);
    }


        
        
    }
}