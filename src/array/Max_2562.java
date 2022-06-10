package array;

import java.util.Scanner;

public class Max_2562 {

	public static void main(String[] args) {
		
		int n = 9;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i < n ; i++) {
			if(arr[cnt] < arr[i]) {
				cnt = i;
			}
		}
		
		System.out.println(arr[cnt]);
		System.out.println(cnt + 1);
		sc.close();
	}

}
