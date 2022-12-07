import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] sumArr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = k; i <= n; i++) {
            temp = sumArr[i] - sumArr[i - k];
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(max);
        br.close();
    }
}