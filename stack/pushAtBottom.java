import java.util.Stack;

public class pushAtBottom {

    public static void bottomPush(Stack<Integer> s, int data) {
        // base case
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        bottomPush(s, data);
        s.push(top);

    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        bottomPush(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        reverseStack(s);
        printStack(s);

    }
}
