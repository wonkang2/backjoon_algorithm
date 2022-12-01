import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열 크기
        int n = Integer.parseInt(st.nextToken());
        // 질의
        int m = Integer.parseInt(st.nextToken());
        // 누적 합 배열
        int[][] sumArr = new int[n + 1][n + 1];
        int temp = 0;

        // 따로 배열에 저장하지 않고, 받자 마자 누적합 구하기
        for (int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                temp = Integer.parseInt(st.nextToken());
                sumArr[i][j] = temp + sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1];
            }
        }

        // 질의
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result =
                    sumArr[x2][y2] - sumArr[x2][y1 - 1] - sumArr[x1 - 1][y2] + sumArr[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
