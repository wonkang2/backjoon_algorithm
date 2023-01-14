import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < k; i++) {
            int temp = sc.nextInt();
            if (temp != 0) {
                stack.push(temp);
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            System.out.println(result);
        } else {
            int stackSize = stack.size();
            for (int i = 0; i < stackSize; i++) {
                result += stack.pop();
            }
            System.out.println(result);
        }
    }
}