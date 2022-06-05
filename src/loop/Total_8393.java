package loop;

import java.util.Scanner;

/**
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 
 * 1부터 n까지 합을 출력한다.
 */
public class Total_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			total += (i + 1);
		}
		
		System.out.println(total);
	}

}
