class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int temp = target-nums[i];
            if(!map.isEmpty() && map.containsKey(temp)){
                int[] arr={map.get(temp), i};
                return arr;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
// TC: O(n)
// SC: O(1)

// *******************************************************

// Approch 2 Brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }

        return arr;
    }
}
