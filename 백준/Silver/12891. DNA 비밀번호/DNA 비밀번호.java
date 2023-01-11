import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int checkCount = 0;
    static int[] checkArr = new int[4];
    static int[] dnaNumArr = new int[4];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        char[] dnaArr = null;

        int result = 0;

        dnaArr = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            dnaNumArr[i] = Integer.parseInt(st.nextToken());
            if (dnaNumArr[i] == 0) {
                checkCount++;
            }
        }

        // 윈도우 설정
        for (int i = 0; i < p; i++) {
            whenAdd(dnaArr[i]);
        }

        if (checkCount == 4) {
            result++;
        }

        // 윈도우 슬라이딩
        for (int i = 0; i < s - p; i++) {
            whenRemove(dnaArr[i]);
            whenAdd(dnaArr[p + i]);
            if (checkCount == 4) {
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }

    private static void whenAdd(char c) {
        switch (c) {
            case 'A':
                checkArr[0]++;
                if (checkArr[0] == dnaNumArr[0]) {
                    checkCount++;
                }
                break;
            case 'C':
                checkArr[1]++;
                if (checkArr[1] == dnaNumArr[1]) {
                    checkCount++;
                }
                break;
            case 'G':
                checkArr[2]++;
                if (checkArr[2] == dnaNumArr[2]) {
                    checkCount++;
                }
                break;
            case 'T':
                checkArr[3]++;
                if (checkArr[3] == dnaNumArr[3]) {
                    checkCount++;
                }
                break;
        }
    }

    private static void whenRemove(char c) {
        switch (c) {
            case 'A':
                if (checkArr[0] == dnaNumArr[0]) {
                    checkCount--;
                }
                checkArr[0]--;
                break;
            case 'C':
                if (checkArr[1] == dnaNumArr[1]) {
                    checkCount--;
                }
                checkArr[1]--;
                break;
            case 'G':
                if (checkArr[2] == dnaNumArr[2]) {
                    checkCount--;
                }
                checkArr[2]--;
                break;
            case 'T':
                if (checkArr[3] == dnaNumArr[3]) {
                    checkCount--;
                }
                checkArr[3]--;
                break;
        }
    }
}