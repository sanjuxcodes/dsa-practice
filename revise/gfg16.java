class Solution {
    public int maxCharGap(String s) {
        
        int max=-1;
        // code here
        for(int i =0;i<s.length();i++){
            int x=s.lastIndexOf(s.charAt(i));
            
            if(x!=-1){
               int len= x-1-i;
               max=Math.max(max,len);
            }
            
        }
        if(max>=0){
            return max;
        }
        return -1;
    }
};