package conditional;

import java.util.Scanner;
/**
 * 첫째 줄에 두 정수 H와 M이 주어진다. 
 * (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 
 * 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
 * 입력 시간은 24시간 표현을 사용한다. 
 * 24시간 표현에서 하루의 시작은 0:0(자정)이고, 
 * 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 
 * 불필요한 0은 사용하지 않는다.
 * 
 * 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 
 * 설정해야 하는 알람 시간을 출력한다. 
 * (입력과 같은 형태로 출력하면 된다.)
 */
public class Alarm_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int i = 45;
		
		m -= 45;
		
		if (m < 0) {
			h -= 1;
			m += 60; 
		}
		
		if (h < 0) {
			h += 24;
		}
		
		System.out.printf("%d %d",h, m);
		sc.close();
	}

}
