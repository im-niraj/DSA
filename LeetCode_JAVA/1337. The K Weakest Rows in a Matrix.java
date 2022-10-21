
// Approch 1 very detaild code 
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int res[] = new int[k];
        int row = mat.length;
        int col = mat[0].length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<row; i++){
            int countOfSoldiers = 0;
            for(int j=0; j<col; j++){
                if(mat[i][j] == 1)countOfSoldiers++;
            }
            map.put(i, countOfSoldiers);
        }
     
        int[] keys = new int[row];
        int[] values = new int[row];
        int index=0;
        for(Integer val : map.keySet()){
           keys[index] = val;
           values[index++] = map.get(val);
        }

        // bubble sort
        for(int i=0; i<row-1; i++){
            for(int j=0; j<row-i-1; j++){
                if(values[j] > values[j+1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
       // key sort according to values
                    temp = keys[j];
                    keys[j] = keys[j+1];
                    keys[j+1] = temp;
                }
            }
        }
        for(int i=0; i<k; i++){
            res[i] = keys[i];
        }
        return res;
    }
}
