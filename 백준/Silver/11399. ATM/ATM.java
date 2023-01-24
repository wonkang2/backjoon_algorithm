import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] S = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            int point = i;
            int value = A[point];

            for (int j = i - 1; j >= 0; j--) {
                if (A[i] > A[j]) {
                    point = j + 1;
                    break;
                }
                if (j == 0) {
                    point = 0;
                }
            }
            for (int j = i; j > point; j--) {
                A[j] = A[j - 1];
            }
            A[point] = value;
        }
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = A[i] + S[i - 1];
        }

        for (int i = 0; i < S.length; i++) {
            result += S[i];
        }
        System.out.println(result);
    }
}