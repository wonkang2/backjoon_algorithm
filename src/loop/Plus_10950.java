package loop;

import java.util.Scanner;
/**
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 
 * 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Plus_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
		sc.close();
	}
}
