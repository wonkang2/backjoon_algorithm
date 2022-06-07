package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class Min_10871 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = sc.nextInt();
		int x = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a < x) {
				arr.add(a);
			}
		}
		sc.close();
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
}
