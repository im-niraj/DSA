class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int elem1 = mat.length * mat[0].length;
        if(r*c != elem1){
            return mat;
        }
        int[][] res = new int[r][c];
        int idxR=0;
        int idxC=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(idxC < c){
                    res[idxR][idxC++] = mat[i][j];
                }
                else{
                    idxC=0;
                    idxR++;
                    res[idxR][idxC++] = mat[i][j];
                }
            }
        }
        return res;
    }
}

// TC: O(n^2)
// auxiliary SC:(r*c);
