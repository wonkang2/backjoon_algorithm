import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        n : 수의 개수, m : 합 횟수
        n개의 수
        j와 k : j~k까지의 합
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 합 배열 생성[n + 1]
        int[] sumArr = new int[n + 1];
        StringTokenizer numSt = new StringTokenizer(br.readLine());
        // for (n)
        for (int i = 1; i <= n; i++) {
            // n번의 입력 -> 합 배열에 저장 [n-1] + [n]
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(numSt.nextToken());
        }

        // for (m)
        for (int i = 0; i < m; i++) {
            // j와 k 입력받음
            StringTokenizer range = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(range.nextToken());
            int k = Integer.parseInt(range.nextToken());
            // 결과 출력 : 합배열[k] - 합배열[j-1]
            System.out.println(sumArr[k] - sumArr[j-1]);
        }
        br.close();
    }
}
