import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {
    public static void push(int data, Queue<Integer> queue) {
        int size = queue.size();
        queue.add(data);
        for (int i = 0; i < size; i++) {
            queue.add(queue.peek());
            queue.poll();
        }
    }

    public static void pop(Queue<Integer> queue) {
        System.out.println(queue.poll());
    }

    public static void print(Queue<Integer> queue) {
        Queue<Integer> temp = new LinkedList<>(queue);

        while (!temp.isEmpty()) {
            System.out.print(temp.poll() + "|");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        push(10, queue);
        print(queue);
        push(20, queue);
        print(queue);
        push(30, queue);
        print(queue);
        pop(queue);
        print(queue);
        pop(queue);
        print(queue);
        pop(queue);
        System.out.println(queue.isEmpty());

    }

}
