import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            sb.append(br.readLine());
            for (int j = 0; j < sb.length(); j++) {
                char temp = sb.charAt(j);
                if (temp == '(') {
                    stack.push(temp);
                } else { // ')' 일 경우
                    if (stack.isEmpty()) { // 비어있을 경우 () 성립 x
                        stack.push(temp);
                        break;
                    } else if (stack.peek().equals('(')) {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
            stack.clear();
            sb.setLength(0);
        }
        System.out.println(result);
        br.close();
    }
}