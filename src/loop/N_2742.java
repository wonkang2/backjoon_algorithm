package loop;

import java.util.Scanner;

/**
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class N_2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			System.out.println(n - i);
		}
	}

}
