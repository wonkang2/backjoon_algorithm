import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        n : 정수 N (1 <= N && N <= 10000000)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startPoint = 1;
        int endPoint = 1;
        int sum = startPoint;
        int cnt = 0;

        while (endPoint <= n){
            // 연속된 합이 n보다 클 경우 startPoint 한 칸 전진
            if (sum > n) {
                sum -= startPoint;
                startPoint++;
            }
            // 연속된 합이 n보다 작을 경우 endPoint 한 칸 전진
            else if (sum < n) {
                endPoint++;
                sum += endPoint;
            }
            // 같을 경우 count 반영, endPoint 한 칸 전진
            else {
                endPoint++;
                sum += endPoint;
                cnt ++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
