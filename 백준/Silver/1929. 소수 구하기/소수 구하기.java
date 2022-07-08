import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Boolean> result = new ArrayList<>();
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        // 0과 1은 모두 실수가 아니므로 미리 false 추가
        result.add(0, false);
        result.add(1, false);
        // 2부터 입력받은 최대 수까지 true 추가
        for (int i = 2; i <= max; i++) {
            result.add(true);
        }
        // 2 ~ max의 제곱근까지 반복 (시간 단축하기 위해)
        for (int i = 2; i <= Math.sqrt(max + 1); i++) {
            // 에라토스테네스의 체 참고함
            // 0과 1을 제외하고 모두 true이기 때문에 조건문 통과
            if(result.get(i)){
                // 2부터 max의 제곱근까지의 수의 배수들을 모두 false값으로 변경 -> 위의 조건문을 통해 시간 단축
                for (int j = i * i; j <= max; j += i) {
                    result.set(j, false);
                }
            }
        }
        // 최소 범위부터 최대 범위까지 true인 인덱스 append (true == 소수)
        for (int i = min; i <= max; i++) {
            if (result.get(i)) {
                sb.append(i).append("\n");
            }
        }
        // 출력
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}