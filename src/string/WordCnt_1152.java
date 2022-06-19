package string;

import java.util.Scanner;

public class WordCnt_1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		int cnt = 1;
		
		msg = msg.trim();
		
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == ' ') {
				cnt ++;
			}
		}
		
		if (msg.length() < 1) {
			cnt = 0;
		} 
		
		System.out.println(cnt);
		sc.close();
	}
}
