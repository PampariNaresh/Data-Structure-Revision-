//import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement_6 {
    public static void printArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i += 1) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int next[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        // Arrays.fill(next, -1);

        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = i + 1; j < n; j++) {
         * if (arr[j] > arr[i]) {
         * next[i] = arr[j];
         * break;
         * }
         * }
         * for (int j = 0; j <i; j++) {
         * if (arr[j] > arr[i]) {
         * next[i] = arr[j];
         * break;
         * }
         * }
         * }
         */
        /*
         * Brute Force O(n^2)
         * for (int i = 0; i < n; i++) {
         * for (int j = i + 1; j < i + n - 1; j++) {
         * int ind = j % n;
         * if (arr[ind] > arr[i]) {
         * next[i] = arr[ind];
         * break;
         * }
         * 
         * }
         * }
         */
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i % n]) {
                stack.pop();
            }
            if (i < n) {
                next[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(arr[i % n]);
        }
        printArray(next);
        sc.close();
    }
}
