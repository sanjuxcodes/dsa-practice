class Solution {

    static void dfs(int n ,ArrayList<ArrayList<Integer>> adj,int vis[]){
        vis[n]++;

        for(int i: adj.get(n)){

            if(vis[i]==0){
            dfs(i,adj,vis);
            }

        }
    }
    public int findCircleNum(int[][] isConnected) {

        ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>> ();


        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){

                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }


            }

            

        }

int vis[]=new int[isConnected.length];

            int c=0;

            for(int i =0;i<isConnected.length;i++){
                if(vis[i]==0){
                    c++;
                    dfs(i,adj,vis);
                }
            }
            return c;

        
    }
}