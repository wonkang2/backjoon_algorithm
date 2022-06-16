package string;

import java.util.Scanner;

public class Total_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		String numbers = sc.next();
		
		for (int i = 0; i < n; i++) {
			total += Character.getNumericValue(numbers.charAt(i));
		}
		
		System.out.println(total);
		sc.close();
	}
}
