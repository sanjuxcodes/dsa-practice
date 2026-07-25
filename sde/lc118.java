class Solution {

    List<Integer> genrow(int row){
         long ans=1;

        List<Integer> ll= new LinkedList<>();
        ll.add(1);
        for(int c=1;c<row;c++){

            ans= ans*(row-c);
            ans=ans/c;

            ll.add((int)ans);

        } 
        return ll;
    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> a= new LinkedList<List<Integer>>();
        
        for(int i =1;i<=numRows;i++){
            a.add(genrow(i));
        }

        return a;
    }
}