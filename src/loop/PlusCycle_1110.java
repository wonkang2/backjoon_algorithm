package loop;

import java.util.Scanner;

public class PlusCycle_1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int a, b;
		int cnt = 0;
		sc.close();
		
		// 주어진 수가 0보다 작을 때
		if (n < 10) {
			n *= 10;
		} else if(n < 0 || n > 100) {
			return;
		}
		
		sum = n;
		
		do {
			a = sum / 10;
			b = sum % 10;
			sum = a + b;
			sum = (b * 10) + (sum % 10);
			cnt ++;
			
		} while (sum != n);
		
		System.out.println(cnt);
	}

}
