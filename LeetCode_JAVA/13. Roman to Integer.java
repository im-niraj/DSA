// Approch no 1
class Solution {
    public int romanToInt(String s) {
        int sum=0, num=0, prev = 0;

        for(int i=s.length()-1; i>=0; i--){
            switch(s.charAt(i)){
                case 'I' : num = 1; break;
                case 'V' : num = 5; break;
                case 'X' : num = 10; break;
                case 'L' : num = 50; break;
                case 'C' : num = 100; break;
                case 'D' : num = 500; break;
                case 'M' : num = 1000; break;
            }

            if(num < prev) sum -= num;
            else sum += num;
            prev=num;
        }

        return sum;
    }

}

/*---------------------------------------------------*/
// Approch no 2
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman= new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int sum=0;
        int preValue=0;
        for(int i=s.length()-1; i>=0; i--){
            if(roman.get(s.charAt(i)) < preValue){
                sum -= roman.get(s.charAt(i));
            }
            else{
                sum += roman.get(s.charAt(i));
            }
            preValue = roman.get(s.charAt(i));
        }

        return sum;
    }

}
