import java.util.Scanner;
import java.util.Stack;

public class PrevIousSmallestElement {

    public static void printArray(int[] var0) {
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            System.out.print(var0[var2] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int prev[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);

        }
        printArray(prev);
        sc.close();
    }
}
