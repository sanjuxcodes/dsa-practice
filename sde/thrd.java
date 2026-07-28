class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }

        LinkedHashSet<Integer> ls= new LinkedHashSet<>();

        for(int i : nums){
            ls.add(i);
        }

        int arr[]= new int[ls.size()];
        int k=0;
        for(int i: ls){
            arr[k++]=i;

        }
        if(arr.length<3){
            return arr[arr.length-1];
        }

        return arr[arr.length-3];
    }
}