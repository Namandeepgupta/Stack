import java.util.*;

public class ReverseAString{
    public static String reverseString(String s){
        Stack<Character> ch = new Stack<>();
        int index = 0;
        while(index < s.length()){
            ch.push(s.charAt(index));
            index++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!ch.isEmpty()){
            char c = ch.pop();
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String s = "namandeep";
        String result = reverseString(s);
        System.out.println(result);
    }
}
