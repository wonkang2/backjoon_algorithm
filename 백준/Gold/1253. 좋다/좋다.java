import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int point1 = 0;
        int point2 = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        for (int i = 0; i < N; i++) { // 두 수이기때문에 0번째 인덱스 패스
            point1 = 0;
            point2 = N - 1;
            while (point1 < point2) {
                if (A[point1] + A[point2] == A[i]) {
                    if (point1 == i) {
                        point1++;
                    } else if (point2 == i) {
                        point2--;
                    } else {
                        result++;
                        break;
                    }
                } else if (A[point1] + A[point2] > A[i]) {
                    point2--;
                } else if (A[point1] + A[point2] < A[i]) {
                    point1++;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}