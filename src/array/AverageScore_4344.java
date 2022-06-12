package array;

import java.util.Scanner;

public class AverageScore_4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double average;
		int students;
		double result;
		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int[] scores = new int[n];
			average = 0.0;
			result = 0.0;
			students = 0;
			for (int j = 0; j < n; j++) {
				scores[j] = sc.nextInt();
				average += scores[j];
			}

			average = average / n;

			for (int j = 0; j < n; j++) {
				if (average < scores[j]) {
					students++;
				}
			}

			result = (double) students / n * 100;

			System.out.println(String.format("%.3f", result) + "%");
		}

		sc.close();
	}
}
