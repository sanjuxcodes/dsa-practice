class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb= new StringBuilder(s);

        int indx ;


        while((indx = sb.indexOf(part)) != -1){
            sb.delete(indx,indx+part.length());
        }
        return sb.toString();
    }
}