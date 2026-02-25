import java.util.HashSet;

public class longestSubstr {
    class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l=0;
        int maxlen=0;
        HashSet<Character> set= new HashSet<>();

        //sliding window +hs

        for(int r=0;r<s.length();r++){
            //if right end of window contains ele of left then rmv from left(shirnking )
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));//expanding window

            maxlen=Math.max(maxlen,r-l+1);

        }

        return maxlen;
        
    }
}
    
}
