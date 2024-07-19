
import java.util.Stack;

public class ImplementMinStack_4_1 {
    static class Pair {
        int val;
        int minValue;

        Pair() {

        }

        Pair(int val, int minValue) {
            this.val = val;
            this.minValue = minValue;
        }
    }

    public static int getMin(Stack<Pair> stack) {
        return stack.peek().minValue;
    }

    public static void push(int data, Stack<Pair> stack) {
        if (stack.isEmpty()) {
            Pair newpair = new Pair(data, data);
            stack.push(newpair);
        }

        Pair addpair = new Pair();
        if (data <= stack.peek().minValue) {
            addpair.minValue = data;
            addpair.val = data;
        } else {
            addpair.minValue = stack.peek().minValue;
            addpair.val = data;
        }
        stack.push(addpair);

    }

    public static void main(String[] args) {
        Stack<Pair> stack = new Stack<>();
        push(10, stack);
        push(20, stack);
        push(30, stack);
        System.out.println(getMin(stack));
    }
}
