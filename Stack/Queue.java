public class Queue {
    int front = -1;
    int rear = -1;
    int currSize = 0;
    int arr[];
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void isempty() {
        if (rear == front) {
            System.out.println("Queue is Emtpty");
            return;
        }
    }

    public void isfull() {
        if (front == size - 1) {
            System.out.println("Queue is Full");
            return;
        }
    }

    public void enqueue(int data) {
        if (currSize == size) {
            System.out.println("Queue is Full");
        }

        if (currSize == 0 || (front == -1 && rear == -1)) {
            front = 0;
            rear = 0;
            currSize++;
            arr[front] = data;
            return;
        } else {
            rear = (rear + 1) % size;
            arr[rear] = data;
            currSize += 1;
            return;
        }

    }

    public int dequeue() {
        if (currSize == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = arr[front];
        arr[front] = 0;
        if (currSize == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        currSize -= 1;
        return element;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.err.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.isfull();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.isempty();
        q.print();

    }
}
