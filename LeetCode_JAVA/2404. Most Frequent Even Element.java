class Solution {
    public int mostFrequentEven(int[] nums) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        
        int max = -1;
        int elem = -1;
        for(Integer i : map.keySet()){
            if(max < map.get(i)){
                max = map.get(i);
                elem = i;
            }
        }
    return elem;
    }
}


/*
* I have taken TreeMap for this question, because TreeMap gives us sorted keySet().
* We store only even element in map with their occurance.
* Take two variable one is max and other elem
* max will contain max occurance value
* elem will contain max occurance value's element
*/
