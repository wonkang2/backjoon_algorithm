import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        Stack<Integer> stack = new Stack<>();
        StringBuffer result = new StringBuffer();
        boolean isAsc = true;
        int num = 0;
        int point = 1; // 1 <= n && n <= 100,000
        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            num = numArr[i];
            if (point <= num) {
                while (point <= num) {
                    stack.push(point++);
                    result.append("+\n");
                }
                stack.pop();
                result.append("-\n");
            } else {
                if (stack.peek() > num) {
                    isAsc = false;
                    System.out.println("NO");
                    break;
                } else {
                    stack.pop();
                    result.append("-\n");
                }
            }
        }

        if (isAsc) {
            System.out.println(result);
        }

    }
}
