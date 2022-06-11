package array;

import java.util.Arrays;
import java.util.Scanner;

public class Remainder_3052 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inputNumbers = new int[10];
		int[] remainder = new int[10];
		int num = 42;
		
		int cnt = 1;
		
		for (int i = 0; i < inputNumbers.length; i++) {
			inputNumbers[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < inputNumbers.length; i++) {
			remainder[i] = inputNumbers[i] % num;
		}
		
		Arrays.sort(remainder);

		for(int i = 0, j = i + 1; i < remainder.length - 1; i++, j++) {
			
			if (remainder[i] != remainder[j]) {
				cnt ++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
