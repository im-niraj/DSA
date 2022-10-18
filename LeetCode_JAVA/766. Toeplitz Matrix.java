class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               if(i-1 >=0 && j-1 >=0){
                   if(matrix[i-1][j-1] != matrix[i][j]){
                       return false;
                   }
               }
           }
       }
        return true;
    }
}
// time complexity O(n*m)
// space complexity O(1)
