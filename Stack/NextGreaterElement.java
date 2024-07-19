import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void printArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i += 1) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int next[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack();

        // Brute Force
        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = i + 1; j < n; j++) {
         * 
         * if (arr[j] > arr[i]) {
         * next[i] = arr[j];
         * break;
         * }
         * }
         * }
         */
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty())
                next[i] = -1;
            else
                next[i] = stack.peek();
            stack.push(arr[i]);

        }
        printArray(next);

        sc.close();
    }
}
