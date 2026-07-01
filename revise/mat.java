class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        
        
        //int res[][]=new int[matrixA.length][matrixA[0].length];
        // code here
        for(int i=0;i<matrixA.length;i++){
            for(int j =0 ; j<matrixA[0].length;j++){
                matrixA[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        
        for(int i =0;i<matrixA.length;i++){
            for(int j=0;j<matrixA[0].length;j++){
            System.out.print(matrixA[i][j]+ " ");
           
        }
          System.out.println();
        
    }
}
}
