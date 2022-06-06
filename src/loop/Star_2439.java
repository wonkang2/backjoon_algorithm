package loop;

import java.util.Scanner;

/**
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class Star_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}
}
