package string;

import java.util.Scanner;

public class Croatia_2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] croatia = {"c=", "c-", "dz=", "d-"
				, "lj", "nj", "s=", "z="};
		String msg = sc.next();
		
		for (int i = 0; i < croatia.length; i++) {
			
			if (msg.contains(croatia[i])) {
				msg = msg.replaceAll(croatia[i], "x");
			}
		}

		System.out.println(msg.length());
		sc.close();
	}
}
