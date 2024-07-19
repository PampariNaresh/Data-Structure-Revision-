import java.util.Stack;

public class ImplementMinStack_4_2 {
    static int minValue = 0;

    public static void push(int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            minValue = data;
            stack.push(data);
        }
        if (data > minValue) {
            stack.push(data);
        } else {
            stack.push(2 * data - minValue);
            minValue = data;
        }

    }

    public static int pop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return -1;
        }
        int data = stack.peek();
        stack.pop();
        if (data < minValue) {
            minValue = 2 * minValue - data;
        }
        return data;
    }

    public static int top(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        }
        int x = stack.peek();
        if (minValue < x)
            return x;
        return minValue;
    }
    public static int  getMin() {
        return minValue;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        push(10, stack);
        push(20, stack);
        push(30, stack);
        System.out.println(pop(stack));
        System.out.println(getMin());

    }
}
