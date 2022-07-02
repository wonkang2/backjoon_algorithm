import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        StringTokenizer st = new StringTokenizer(inp);
        String a = st.nextToken();
        String b = st.nextToken();
        StringBuilder aBd = new StringBuilder(a);
        StringBuilder bBd = new StringBuilder(b);
        StringBuilder resultBd = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());
        int chk = 0;

        // 자릿수가 다를 경우 맞추기
        if (aBd.length() != bBd.length()) {
            for (int i = aBd.length(); i < maxLen; i++){
                aBd.insert(0, 0);
            }
            for (int i = bBd.length(); i < maxLen; i++){
                bBd.insert(0, 0);
            }
        }
        
        // 인덱스 0이 1의 자리로 하기 위해 리버스
        aBd.reverse();
        bBd.reverse();
        
        // 1의자리 ~ x의 자리까지 연산
        for (int i = 0; i < maxLen; i++){
            int sum = Character.getNumericValue(aBd.charAt(i))
                    + Character.getNumericValue(bBd.charAt(i)) + chk;
            if (sum < 10){
                chk = 0;
            } else {
                sum %= 10;
                chk = 1;
            }
            resultBd.append(sum);
        }
        // 마지막으로 체크가 0이 아니라면 반복문 마지막 연산에서 자릿수 올림이 발생한거니 추가
        if (chk != 0){
            resultBd.append(chk);
        }
        // 위에서 인덱스 0과 1의자리를 맞추려고 리버스했으니 다시 리버스
        resultBd.reverse();
        
        // 리버스한 결과에서 0번째 인덱스가 0이라면 삭제 반복문 ex. 00000010 -> 10
        for (int i = 0; i < resultBd.length();){
            if (Character.getNumericValue(resultBd.charAt(i)) == 0){
                resultBd.deleteCharAt(i);
            } else {
                break;
            }
        }
        
        System.out.println(resultBd);
        br.close();
    }
}
