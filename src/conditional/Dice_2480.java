package conditional;

import java.util.Scanner;
/**
 * 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
 * 
 * 첫째 줄에 게임의 상금을 출력 한다.
 * 
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
 */
public class Dice_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 0;
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
				
		if (d1 == d2 && d2 == d3) {
			money = 10000 + d1 * 1000;
		} else if (d1 == d2 || d1 == d3) {
			money = 1000 + d1 * 100;
		} else if (d2 == d3) {
			money = 1000 + d2 * 100;
		} else {
			int max = d1 > d2 ? (d1 > d3 ? d1 : d3) : (d2 > d3 ? d2 : d3); 
			money = max * 100;
		}
		
		System.out.println(money);
	}

}
