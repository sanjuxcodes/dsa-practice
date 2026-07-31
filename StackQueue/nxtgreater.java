class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i : nums2){
          

            //lc 496
            // when ever hit a larger no than stack curr. top just replace
               
            while(!st.isEmpty() && i > st.peek() ){
                int ele=st.pop();

                map.put(ele , i);
                


            }

             st.push(i);
            
            
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
    int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}