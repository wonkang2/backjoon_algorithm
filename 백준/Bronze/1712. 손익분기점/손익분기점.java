import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int cnt = 0;
        // C * cnt = A + B * cnt
        // Ccnt - Bcnt = A
        // cnt(C - B) = A
        // cnt = A / (C - B)

        if (B >= C){ // 한 대 생산할 때 드는 비용이 C보다 크거나 같을 경우 손익분기점 존재 x
            cnt = -1;
        } else {
            cnt = A / (C - B) + 1; // + 1회부터 최초 이익 발생
        }

        System.out.println(cnt);
        sc.close();

    }
}