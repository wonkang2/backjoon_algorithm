import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 소인수를 담을 ArrayList 선언
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        // 입력받은 값을 int형 num을 선언한 후 형변환을 통해 할당
        int num = Integer.parseInt(br.readLine());

        // 소수는 2부터 시작하므로 i를 2로 초기화 (2는 짝수 중 유일한 소수)
        int i = 2;
        // 나눈 값이 최소 1보다 클 경우 반복
        while(num > 1){
            // 반복 1회에서 짝수를 모두 소수인 2가 나눈다. 그리고 증감연산자를 통해
            // 2->3->4(소수 2에서 걸러짐)->5->6(소수3에서 걸러짐) ... 반복
            if (num % i == 0) {
                num /= i;
                arrList.add(i);
                i = 2;
            } else {
                // 나누기 했을 때 나머지가 생길 때
                i++;
            }
        }
        // 결과 출력을 위한 코드
        Collections.sort(arrList);
        for (int j = 0; j < arrList.size(); j++){
            System.out.println(arrList.get(j));
        }
        br.close();
    }
}