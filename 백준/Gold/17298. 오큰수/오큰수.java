import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] A = new int[N];
        int[] okunsooArr = new int[N];
        StringBuilder result = new StringBuilder();

        int stLength = st.countTokens();
        for (int i = 0; i < stLength; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            int temp = A[i];
            if (A[stack.peek()] < temp) {
                while (!stack.isEmpty() && A[stack.peek()] < temp) {
                    okunsooArr[stack.pop()] = temp;
                }
            }
            stack.push(i);
        }

        if (!stack.isEmpty()) {
            int stackSize = stack.size();
            for (int i = 0; i < stackSize; i++) {
                int j = stack.pop();
                okunsooArr[j] = -1;
            }
        }

        for (int i = 0; i < okunsooArr.length; i++) {
            result.append(okunsooArr[i] + " ");
        }

        System.out.println(result);
        br.close();
    }
}