import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Boolean> primeNumbers = new ArrayList<>();
        int primeNumberCnt, max;
        int min;
        // '0' 입력 전까지 무한 반복
        while (true) {
            min = Integer.parseInt(br.readLine());
            // 입력 값이 0일 경우 반복 종료
            if (min == 0) { break; }
            max = min * 2;
            primeNumberCnt = 0;
            // 0과 1부터 false로 미리 추가
            primeNumbers.add(0, false);
            primeNumbers.add(1, false);
            // 2부터 max까지 전부 true로 추가
            for (int i = 2; i <= max; i++) {
                primeNumbers.add(i, true);
            }
            // 에라토스테네스의 체 참고 : 2부터 max값의 제곲근까지 반복 
            for (int i = 2; i <= Math.sqrt(max + 1); i++) {
                // 2의 배수, 3의 배수 ... max의 제곱근 배수까지 false로 재할당
                for (int j = i + i; j <= max; j += i) {
                    primeNumbers.set(j, false);
                }
            }
            // 입력한 값보다 크고 2배 범위보단 작거나 같은 소수 갯수 
            for (int i = min+1; i <= max; i++) {
                if (primeNumbers.get(i)) {
                    primeNumberCnt++;
                }
            }
            // 출력과 ArrayList 초기화
            primeNumbers.clear();
            bw.write(primeNumberCnt + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }

}
