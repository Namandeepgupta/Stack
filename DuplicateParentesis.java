import java.util.*;

public class DuplicateParentesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b) + (c-d))";
        String str1 = "((a+b) + ((c-d)))";
        System.out.println("Result: " + isDuplicate(str1));
    }
}
