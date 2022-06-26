import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // Math.ceil : 나눴을 때 소숫점이 있으면 아직 이동할 거리가 있다는 것으로 + 1일이 더 필요하다는 의미
        // (V - B) : 정상에 도착한 후에는 미끄러지지 않으니 (총 높이 - 올라가는 거리)
        // (A - B) : 미끄러짐까지 포함한 이동 거리
        int result = (int)Math.ceil((V - B) / (double)(A - B)); 

        bw.write(Integer.toString(result));

        bw.flush();
        br.close();
        bw.close();
    }
}