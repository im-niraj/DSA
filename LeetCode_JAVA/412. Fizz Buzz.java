// Approch 1
class Solution {
    public List<String> fizzBuzz(int n) {
       return IntStream.rangeClosed(1, n).mapToObj(i -> {
            if(i%3==0 && i%5==0) return "FizzBuzz";
            else if(i%3==0) return "Fizz";
            else if(i%5==0) return "Buzz";
            else return String.valueOf(i);
       }).collect(Collectors.toList());
    }
}


/*-------------------------------------------*/
// Approch 2
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0)list.add("FizzBuzz");
            else if(i%3==0)list.add("Fizz");
            else if(i%5==0)list.add("Buzz");
            else list.add(String.valueOf(i));
        }
        return list;
    }
}
