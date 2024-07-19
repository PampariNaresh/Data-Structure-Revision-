import java.util.Arrays;
import java.util.Stack;

public class QueueUsingStack {

    public static void enqueue(int data, Stack<Integer> stack1, Stack<Integer> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.add(data);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

    }

    public static int dequeue(Stack<Integer> stack1) {
        return stack1.pop();
    }

    public static void print(Stack<Integer> stack1) {
        System.out.println(Arrays.toString(stack1.toArray()));
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        enqueue(10, stack1, stack2);
        print(stack1);

        enqueue(20, stack1, stack2);
        print(stack1);

        enqueue(30, stack1, stack2);
        print(stack1);
        dequeue(stack1);
        print(stack1);

    }
}
