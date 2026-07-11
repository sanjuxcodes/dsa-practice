class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int a=0;
        int c=0;

        Arrays.sort(g);
        Arrays.sort(s);

    int i=0;


        while(i<g.length && c<s.length){

            if(g[i]<=s[c]){
                i++;
                c++;


            }
            else
                c++;


        }

        return i;
        
    }
}