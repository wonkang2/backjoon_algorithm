package loop;

import java.util.Scanner;

/**
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 각 테스트 케이스마다 "Case #x: A + B = C" 
 * 형식으로 출력한다. x는 테스트 케이스 번호이고 
 * 1부터 시작하며, C는 A+B이다.
 */
public class Plus_11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0, x = 1; i < t; i++,x++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			System.out.println("Case #" + x + ": " + a + " + " + b + " = " + c);
		}
		
		sc.close();
	}
}
