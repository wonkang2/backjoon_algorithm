import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for (int k = 0; k < cnt; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());// 층 수
            int W = Integer.parseInt(st.nextToken()); // 방 수
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님

            String[][] hotel = new String[H][W];

            // 호텔 방에 대해 2차원 배열 생성
            for (int i = 0; i < hotel.length; i++){
                for (int j = 0; j < hotel[i].length; j++){
                    if (j < 9){
                        hotel[i][j] = Integer.toString((i + 1) * 10) + Integer.toString(j + 1);
                    } else {
                        hotel[i][j] = Integer.toString(i + 1 ) + Integer.toString(j + 1);
                    }
                }
            }

            int x = (N - 1) / H; // 호 수 (호텔은 1호부터 시작, 배열은 0부터 시작하므로 -1)
            int y = (N - 1) % H; // 층 수 (호텔이 1층부터 시작, 배열은 0부터 시작하므로 -1)

            System.out.println(hotel[y][x]);
        }
        br.close();
    }
}