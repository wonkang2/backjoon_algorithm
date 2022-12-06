import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int fp = 0;
        int sp = n - 1;
        int cnt = 0;
        int temp = 0;

        while (fp < sp) {
            temp = arr[fp] + arr[sp];
            if (temp < m) {
                fp++;
            } else if (temp > m) {
                sp--;
            } else {
                cnt ++;
                fp++;
                sp--;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}