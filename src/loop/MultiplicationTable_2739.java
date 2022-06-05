package loop;

import java.util.Scanner;
/**
 * N을 입력받은 뒤, 구구단 N단을 출력하는 
 * 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다
 * 
 * 출력형식과 같게 N*1부터 N*9까지 출력한다.
 */
public class MultiplicationTable_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d * %d = %d\n", n, i+1, n*(i+1));
		}
	}
}
