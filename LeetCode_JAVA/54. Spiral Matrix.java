class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int L=0;
        int R=matrix[0].length-1;
        int T=0;
        int B=matrix.length-1;
        int mn = matrix[0].length * matrix.length;
        
        List<Integer> list = new ArrayList<>();
        while(list.size() < mn){
            for(int i=L; i<=R && list.size() < mn; i++){
                list.add(matrix[T][i]);
            }
            T++;
            for(int i=T; i<=B && list.size() < mn; i++){
                list.add(matrix[i][R]);
            }
            R--;
            for(int i=R; i>=L && list.size() < mn; i--){
                list.add(matrix[B][i]);
            }
            B--;
            for(int i=B; i>=T && list.size() < mn; i--){
                list.add(matrix[i][L]);
            }
            L++;
        }
        
        return list;
    }
}
// Time Complexity = O(m * n) = O(n^2)
// Space Complexity = O(1)
// Auxilarty Space complexity for answer = O(n)
