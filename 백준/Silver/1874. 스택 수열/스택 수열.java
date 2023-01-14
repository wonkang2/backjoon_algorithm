import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        int[] numArr = new int[N];

        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }
        int num = 1;
        boolean check = true;
        for (int i = 0; i < numArr.length; i++) {
            int temp1 = numArr[i];
            if (temp1 >= num) {
                while (temp1 >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int temp2 = stack.pop();
                if (temp2 > temp1) {
                    System.out.println("NO");
                    check = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (check) {
            System.out.println(sb);
        }
    }
}