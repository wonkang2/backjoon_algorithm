import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] apartment = new int[15][15];

        for (int i = 0; i < apartment.length; i++){
            apartment[i][0] = 1;
            apartment[0][i] = i + 1;
        }

        for (int i = 1; i < apartment.length; i++){
            for (int j = 1; j < apartment[i].length; j++){
                apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
            }
        }
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apartment[k][n-1]);
        }
        br.close();
    }
}