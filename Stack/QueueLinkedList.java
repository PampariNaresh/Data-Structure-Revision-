
public class QueueLinkedList {
    static Node head = null;
    static Node tail = null;

    public static void enqueue(int data) {
        Node newnode = new Node(data);
        if (tail == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static int dequeue() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = head.data;
        head = head.next;
        return element;

    }

    public static void printQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        Node() {

        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String args[]) {

        enqueue(10);
        printQueue();
        enqueue(20);
        printQueue();
        enqueue(30);
        printQueue();
        dequeue();
        printQueue();;
        dequeue();
        printQueue();
        dequeue();
        
        dequeue();
     

        ;

    }
}
