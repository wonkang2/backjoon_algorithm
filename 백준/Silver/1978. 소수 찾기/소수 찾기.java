import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수 입력 개수 입력 받음
        int idx = Integer.parseInt(String.valueOf(br.readLine()));
        // 정수 입력 개수에 따른 배열
        int[] numbers = new int[idx];
        // 정수 입력 받아 배열에 저장,
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;

        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            numbers[i] = temp;
            i++;
        }

        // 소수 판별
        int primeCnt = 0;
        boolean isPrime;
        for (int j = 0; j < numbers.length; j++){
            isPrime = true;
            // 2는 소수
            if (numbers[j] == 2) {
                primeCnt++;
                continue;
            }
            // 1 또는 2를 제외한 정수는 소수 X
            if (numbers[j] % 2 == 0 || numbers[j] == 1 ){
                continue;
            }
            // 정수의 범위 3부터 정수 - 1까지의 범위 중 하나라도 나머지가 0인 정수가 있으면
            // 그 정수는 소수 X (소수 : 1과 자신의 수)
            for (int k = 2; k < numbers[j] - 1; k++) {
                if (numbers[j] % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCnt++;
            }
        }
        System.out.println(primeCnt);
    }
}