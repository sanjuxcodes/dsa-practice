class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length-1;

        Stack<Integer> st= new Stack<>(); 
        int idx[]= new int[n+1];
        int ans[]= new int[n+1];

        while(n>=0){
            int d=0;
            int curr= temperatures[n];
       
            while(!st.empty() && temperatures[st.peek()]<= curr){
                st.pop();
            }

            if(st.empty()){
                ans[n]=0;
            }else{
            
                ans[n]=st.peek()-n;
            }
                 st.push(n);
                 n--;
                     

        }
        return ans;
        
    }
}