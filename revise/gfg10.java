class Solution {
    String encryptString(String s) {
        // code here
        int f=1;
        
        StringBuilder sb = new StringBuilder();
        
        char l=s.charAt(s.length()-1);
        for(int i =0;i<s.length()-1;i++){
            
            if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
                sb.append(f);
                f=1;
                
            }
            else
                f++;
            
        }
        sb.append(l);
        sb.append(f);
        
        return sb.reverse().toString();
    }
}