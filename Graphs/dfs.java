class Solution {
    
    static void dfs(int node, int vis[],ArrayList<Integer> ls,ArrayList<ArrayList<Integer>> adj){
        vis[node]++;
        ls.add(node);
        
        for(int x: adj.get(node)){
            
            if(vis[x]==0){
                dfs(x,vis,ls,adj);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[]= new int[adj.size()];
        
        ArrayList<Integer> ls = new ArrayList<>();
        
        dfs(0,vis,ls,adj);
        
        return ls;
        
        
        
    }
}