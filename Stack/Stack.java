
class Stack {
    static int top = -1;

    public static int pop(int arr[], int n) {
        if (top > 0 && top <= n) {
            top--;
            int element = arr[top];
            return element;
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }

    }

    public static void push(int arr[], int n, int element) {
        top++;
        if (top >= 0 && top < n) {
            arr[top] = element;
        } else if (top == n) {
            System.out.println("Stack is Full");

        }
    }

    public static int peek(int arr[]) {
        return arr[top];
    }

    public static void main(String[] args) {
        int n = 3;
        int arr[] = new int[3];
        push(arr, n, 2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        push(arr, n, 3);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        push(arr, n, 3);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        push(arr, n, 3);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(pop(arr, n));
        System.out.println(pop(arr, n));
        System.out.println(pop(arr, n));
        System.out.println(pop(arr, n));

        System.out.println();

    }
}