import java.util.*;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int push){
        if(s.isEmpty()){
            s.push(push);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, push);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());          
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s
        reverseStack(s);
        printStack(s);
    }
}
