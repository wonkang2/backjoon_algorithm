import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int o1Abs = Math.abs(o1);
            int o2Abs = Math.abs(o2);

            if (o1Abs == o2Abs) {
                return o1 > o2 ? 1 : -1;
            } else {
                return o1Abs - o2Abs;
            }
        });
        for (int i = 0; i < N; i++) {
            int inp = Integer.parseInt(br.readLine());
            if (inp == 0) {
                if (queue.isEmpty()) {
                    result.append("0\n");
                } else {
                    result.append(queue.poll() + "\n");
                }
            } else {
                queue.add(inp);
            }
        }
        System.out.println(result);
        br.close();
    }
}