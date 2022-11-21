import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "aabbcde";
        StringBuilder sb1 = new StringBuilder();
        int count=1;
        int i;
        for(i=0; i<str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1) && count == 1){
                sb1.append(count+""+str.charAt(i));
            }
            else if(str.charAt(i) == str.charAt(i+1)){
               count++;
            }
            else if(str.charAt(i) != str.charAt(i+1) && count >= 2){
                sb1.append(count+""+str.charAt(i));
                count=1;
            }
        }
        sb1.append(count+""+str.charAt(i));
       
        String ChallengeToken = "i8a0qgr2bd";
        String[] strArr = ChallengeToken.split("");
        HashSet<String> hs= new HashSet<>(Arrays.asList(strArr));
        
        StringBuilder sb = new StringBuilder();
        for( i=0; i<sb1.length(); i++){
            String s1 = ""+sb1.charAt(i);
            if(hs.contains(s1)){
                sb.append("--"+s1+"--");
            }
            else{
                sb.append(s1);
            }
        }
        System.out.println(sb.toString());
        
    }
}
