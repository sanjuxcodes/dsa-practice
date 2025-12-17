public class maxConsOnes {
    public static int max(int a , int b){
        if(a<b){
            return b;
        }
        else
            return a;
    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxi =0;
        int c=0;

        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                maxi=max(maxi,c);
            }
            else{
                c=0;
            }


        }
        return maxi;
    }
    public static void main(String[] args) {

        int arr[]={1,0,1,1,1,0,0,1,1,1,1,0,1};
        System.out.println("max consecutive no. of 1 is : "+ findMaxConsecutiveOnes(arr));

        
    }
    
}
