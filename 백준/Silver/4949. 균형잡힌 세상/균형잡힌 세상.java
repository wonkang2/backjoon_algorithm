import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while (!sb.append(br.readLine()).toString().equals(".")) {
            for (int i = 0; i < sb.length(); i++) {
                char temp = sb.charAt(i);
                switch (temp) { // 관련없는 문자들이 많기 때문에 switch문을 사용하여 1차 필터 역할을 하게 함.
                    case '(':
                    case '[':
                        stack.push(temp);
                        break;
                    case ')':
                        if (stack.isEmpty()) { // stack이 비어있을 경우 균형("()")을 이루지 못한다.
                            stack.push(temp);
                        } else if (stack.peek().equals('(')) {
                            stack.pop();
                        } else { // '('외의 다른 문자('[')일 경우 균형을 이루지 못한다.
                            stack.push(temp);
                        }
                        break;
                    case ']':
                        if (stack.isEmpty()) { // 위와 동일
                            stack.push(temp);
                        } else if (stack.peek().equals('[')) {
                            stack.pop();
                        } else {
                            stack.push(temp);
                        }
                        break;
                }
            }
            if (stack.isEmpty()) {
                result.append("yes\n");
            } else {
                result.append("no\n");
            }
            stack.clear();
            sb.setLength(0);
        }
        System.out.println(result);
        br.close();
    }
}