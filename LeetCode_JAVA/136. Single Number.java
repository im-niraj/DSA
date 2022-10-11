class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int count=1;
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[i]==nums[j]){
                    count++;
                } 
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }
}

// this is brute force solution
// Time Complexity = O(n^2)



/*------------------------------------------*/
class Solution {
    public int singleNumber(int[] nums) {
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Integer i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}
// this is brute force solution
// Time Complexity = O(nLogn)

