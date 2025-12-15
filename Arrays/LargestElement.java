public class LargestElement{
    public static  int largest(int[] nums) {

        int largest= nums[0];

        for(int i =0; i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 9};
        System.out.println("Largest element: " + largest(arr));
    }
}