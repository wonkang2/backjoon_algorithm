package string;

import java.util.Scanner;

public class String_1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String msg = sc.next();
		Character[] temp = new Character[msg.length()];
		int cnt;
		int max1 = -1;
		int max2 = -1;
		char result = 0;
		
		msg = msg.toUpperCase();
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = msg.charAt(i);
		}
		
		for (int i = 0; i < temp.length; i++) {
			cnt = 0;
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] == null) {
					break;
				}
				
				if (temp[i] == temp[j]) {
					cnt ++;
					temp[j] = null;
				}
			}
			if (cnt == max1){
				max2 = cnt;
			} else if (cnt > max1) {
				max1 = cnt;
				result = temp[i];
			}
		}
		
		if (max1 == max2) {
			System.out.println('?');
			sc.close();
			return;
		}
		System.out.println(result);
		sc.close();
	}
}
