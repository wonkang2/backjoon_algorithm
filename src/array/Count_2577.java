package array;

import java.util.Scanner;

public class Count_2577 {

	public static void main(String[] args) {
		
		char[] numbers = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int cnt;
		int total = a * b * c;
		
		String str = Integer.toString(total);
		
		for (int i = 0; i < numbers.length; i++) {
			cnt = 0;
			for (int j = 0; j < str.length(); j++) {
				if (numbers[i] == str.charAt(j)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
