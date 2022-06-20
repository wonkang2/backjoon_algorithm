package string;

import java.util.Scanner;

public class Dial_5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		int result = 0;
		int s;
		
		for (int i = 0; i < str.length(); i++) {
			s = 2;
			switch (str.charAt(i)){
			case 'A':case 'B':case 'C':
				s += 1;
				break;
			case 'D':case 'E':case 'F':
				s += 2;
				break;
			case 'G':case 'H':case 'I':
				s += 3;
				break;
			case 'J':case 'K':case 'L':
				s += 4;
				break;
			case 'M':case 'N':case 'O':
				s += 5;
				break;
			case 'P':case 'Q':case 'R':case 'S':
				s += 6;
				break;
			case 'T':case 'U':case 'V':
				s += 7;
				break;
			case 'W':case 'X':case 'Y':case 'Z':
				s += 8;
				break;
			}
			result += s;
		}
		System.out.println(result);
		sc.close();

	}
}
