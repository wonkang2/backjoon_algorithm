import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];

        for (int i = 0; i < T; i++) {
            stack.push(br.readLine());
        }

        for (int i = 0; i < T; i++) {
            int checkVPS = 0;
            char[] chars = stack.pop().toCharArray();
            if (chars[chars.length - 1] == '(') {
                checkVPS ++;
            } else if (chars[0] == ')') {
                checkVPS --;
            } else {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == '(') {
                        checkVPS++;
                    } else {
                        if (checkVPS < 1) {
                            checkVPS = -1;
                            break;
                        } else {
                            checkVPS--;
                        }
                    }
                }
            }
            if (checkVPS == 0) {
                result[result.length - 1 - i] = "YES";
            } else {
                result[result.length - 1 - i] = "NO";
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
        br.close();
    }
}