package basic;

import java.util.Scanner;

/**
 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class Multiplication_2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		int one = num2 % 10;
		int ten = (num2 % 100) / 10 ;
		int hundred = num2 / 100;
		
		System.out.println(num1 * one);
		System.out.println(num1 * ten);
		System.out.println(num1 * hundred);
		
		System.out.println(num1 * num2);
	}

}
