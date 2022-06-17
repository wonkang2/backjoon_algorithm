package string;

import java.util.Scanner;

public class StringLoop_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String msg;
		int r;
		
		for(int i = 0; i < n; i++) {
			r = sc.nextInt();
			msg = sc.next();
			
			for (int j = 0; j < msg.length(); j++) {
				
				for (int k = 0; k < r; k++) {
					
					System.out.print(msg.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
