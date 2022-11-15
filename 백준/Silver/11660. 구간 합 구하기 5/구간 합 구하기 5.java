import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // n : 표의 크기 (정사각형), m : 결과 도출 횟수
        // x1 y1 x2 y2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        // 합배열 생성
        int[][] result = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                result[i][j] = result[i][j - 1] + result[i - 1][j] - result[i - 1][j - 1] + arr[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());

            System.out.println(result[x2][y2] - result[x1 - 1][y2] - result[x2][y1 - 1] + result[x1 - 1][y1 - 1]);
        }
        br.close();
    }
}
