import java.util.*;

public class PushAtBottam {
    public static void pushAtBottom(Stack<Integer> s, int push){
        if(s.isEmpty()){
            s.push(push);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, push);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int push = 4;
        pushAtBottom(s, push);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
