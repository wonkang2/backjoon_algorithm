import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int capacity = Integer.parseInt(br.readLine());
        Stack stk = new Stack(capacity);
        
        int i = 0;
        while (i < capacity) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    stk.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(stk.pop());
                    break;
                case "size":
                    System.out.println(stk.size());
                    break;
                case "empty":
                    System.out.println(stk.isEmpty());
                    break;
                case "top":
                    System.out.println(stk.top());
                    break;
            }
            i++;
        }
        br.close();
    }
}
class Stack {
    private int[] stk;
    private int capacity;
    private int ptr;
    public Stack(int capacity) {
        this.capacity = capacity;
        stk = new int[this.capacity];
        ptr = 0;
    }
    // push X : 정수 X를 스택에 넣는 연산
    public int push(int x)  {
        return stk[ptr++] = x;
    }
    // pop : 스택에서 가장 위에 있는 정수를 빼고 그 수를 출력하며 정수가 없을 경우 -1 출력
    public int pop() {
        if (ptr < 1) {
            return -1;
        }
        return stk[--ptr];
    }
    // size : 스택에 들어 있는 정수의 개수를 출력
    public int size() {
        return ptr;
    }
    // empty : 스택이 비어있으면 1, 아니면 0을 출력
    public int isEmpty() {
        if (ptr == 0) {
            return 1;
        }
        return 0;
    }
    // top : 스텍의 가장 위에 있는 정수를 출력 정수가 없을 경우 -1 출력
    public int top() {
        if (ptr < 1) {
            return -1;
        }
        return stk[ptr - 1];
    }
}
