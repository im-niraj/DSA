class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(divisibal(i)){
                list.add(i);
            }
        }
        return list;
    }
    
    public boolean divisibal(int number){
        
        String s = String.valueOf(number);
        String[] str = s.split("");
        
        for(int i=0; i<s.length(); i++){
            if(Integer.parseInt(str[i]) == 0){
                return false;
            }
            if(number% Integer.parseInt(str[i]) != 0){
                return false;
            }
        }
        return true;
    }
}
