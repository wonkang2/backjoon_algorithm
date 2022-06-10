package array;

import java.util.Scanner;

public class MinMax_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max;
		int min;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		max = arr[0];
		min = arr[0];

		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("%d %d", min, max);
		sc.close();
	}

}
