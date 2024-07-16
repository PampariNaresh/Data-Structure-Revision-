
public class StackLinkedlList {
    static Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.next = next;
            this.data = data;
        }
    }

    public void push(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        } else {
            newnode.next = head;
            head = newnode;
            return;
        }

    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is Empty");
        }
        return head.data;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String args[]) {
        StackLinkedlList st = new StackLinkedlList();
        st.push(2);
        st.printLL();
        st.push(3);
        st.printLL();
        st.push(5);
        st.printLL();
        System.out.println(st.pop());
        st.printLL();
        System.out.println(st.pop());
        st.printLL();
        System.out.println(st.pop());
        st.printLL();
        System.out.println(st.pop());
        st.printLL();

    }
}
