class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWelth=0;
        for(int i=0; i<accounts.length; i++){
            int welth=0;
            for(int j=0; j<accounts[i].length; j++){
                welth+=accounts[i][j];
            }
            maxWelth=Math.max(maxWelth, welth);
        }
        return maxWelth;
    }
}
// TC: O(n^2)
// SC: O(1)
