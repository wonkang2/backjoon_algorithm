package array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageScore_1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		int[] scores = new int[n];
		double average = 0;
		
		for(int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}

		Arrays.sort(scores);
		
		max = scores[n-1];

		for(int i = 0; i < n; i++) {
			average = average + scores[i] / (double)max * 100;
		}
		
		average = average / n;
		System.out.println(average);
		
		sc.close();
	}
}
