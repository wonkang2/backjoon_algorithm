package string;

import java.util.Scanner;

public class GroupWordChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		int chk;
		char finder = 0;
		String input = null;
		
		for (int i = 0; i < n; i++) {
			input = sc.next();
			chk = 0;

			for (int j = 0; j < input.length(); j++) {
				finder = input.charAt(j);
				if (input.indexOf(finder, j + 1) - j > 1) {
					
					chk = 1;
					break;
				}
				
			}
			
			if (chk == 0) {
				result ++;
			}
		}
		
		System.out.println(result);
		sc.close();
		

	}
}
