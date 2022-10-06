class Solution {
    public boolean digitCount(String num) {
        
        String[] str = num.split("");
        int[] arr = new int[str.length];
        for(int i =0; i<arr.length; i++)arr[i] = Integer.parseInt(str[i]);
    
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(i)) map2.put(i, map.get(i));
            else map2.put(i,0);
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != map2.get(i))return false;
        }
        return true;
    }
}
