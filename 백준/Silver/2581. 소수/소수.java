import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minLen = Integer.parseInt(br.readLine());
        int maxLen = Integer.parseInt(br.readLine());
        boolean isExistence = false;
        int primeNumberTotal = 0;
        int minPrimeNumber = 0;
        boolean isPrime;

        for (int i = minLen; i <= maxLen; i++) {
            if (i == 1) {
                continue;
            }
            isPrime = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0 && i != 2) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                isExistence = true;
                primeNumberTotal += i;
                if (minPrimeNumber == 0) {
                    minPrimeNumber = i;
                }
            }
        }

        // 소수가 없을 경우 -1 출력후 종료
        if (!isExistence) {
            System.out.println(-1);
            return;
        }
        System.out.println(primeNumberTotal);
        System.out.println(minPrimeNumber);
        br.close();
    }
}