// by using bubble sort
class Solution {
    
    public void swap(String[] names, int[] heights, int i, int j){
        //swaping height
        int temp = heights[i];
        heights[i] = heights[j];
        heights[j] = temp;
        
        //swap name of the people using same index of height
        String s1 = names[i];
        names[i] = names[j];
        names[j] = s1;
        
    }
    
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i<heights.length-1; i++){
            for(int j=0; j<heights.length-i-1; j++){
                if(heights[j] < heights[j+1]){
                    swap(names, heights, j, j+1); // swap both array using same index number
                }
            }
        }
        return names;
    }
}
