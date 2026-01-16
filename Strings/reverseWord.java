class Solution {
    public String reverseWords(String s) {

        String[] w=s.trim().split("\\s+");

        StringBuilder sb= new StringBuilder();

        int i = w.length-1;

        for(int j=i;j>=0; j--){
            sb.append(w[j]);
            if(j>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}