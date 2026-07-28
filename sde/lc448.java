class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        int vis[]= new int[nums.length];

        for(int i =0;i<nums.length;i++){

           vis[nums[i]-1]++;

        }

        for(int i =0;i<nums.length;i++){
            if(vis[i]==0){
                lst.add(i+1);
            }

        }
        return lst;
        
    }
}