class Solution {
    public int compress(char[] chars) {
        int idx=0;
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==ch){
                cnt++;
                i++;
            }
            if(cnt==1){
                chars[idx++]=ch;
            }
            else{
                chars[idx++]=ch;
                String str=String.valueOf(cnt);
                for(char dig : str.toCharArray()){
                    chars[idx++]=dig;
                }}
        
        i--;
        }
        

        return idx;
        
    }
}