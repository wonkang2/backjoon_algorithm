package array;

import java.util.Scanner;

public class Quiz_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			int cnt = 0;
			int total = 0;
			for(int j = 0; j < str.length(); j++) {
				cnt ++;
				if(str.charAt(j) == 'X') {
					cnt = 0;
				}
				total += cnt;
			}
			System.out.println(total);
		}
		
		sc.close(); 
	}
}
