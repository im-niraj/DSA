// Approch 1
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> list = new ArrayList<>();
        int n1=0; // index nums1 
        int n2=0; // index nums2
        
        while(n1<nums1.length && n2<nums2.length){
            if(nums1[n1]==nums2[n2]){
                list.add(nums1[n1]);
                n1++;
                n2++;
            }
            else if (nums1[n1] < nums2[n2]) n1++;
            else n2++;
       }
       
       int[] arr = new int[list.size()];
       for(int i=0; i<list.size(); i++)arr[i] = list.get(i);
       return arr;
    }
}



// -----------------------------------------------------
// Approch 2
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<nums1.length; i++){
           map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
       }

       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<nums2.length; i++){
           if(map.containsKey(nums2[i])){
               if(map.get(nums2[i])>1){
                   list.add(nums2[i]);
                   map.put(nums2[i], map.get(nums2[i])-1);
               }
               else{
                   list.add(nums2[i]);
                   map.remove(nums2[i]);
               }
           }
       }
       int[] arr = new int[list.size()];
       for(int i=0; i<list.size(); i++)arr[i] = list.get(i);
       return arr;
    }
}

// TC: O(n)
// SC: O(n)
