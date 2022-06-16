package string;

import java.util.Scanner;

public class AsciiCode_11654 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.next();
		
		if(inp.length() > 1) {
			System.out.println("알파벳 소문자, 대문자, 숫자 0-9 중 하나만 입력하세요.");
			return;
		}
		
		char chr = inp.charAt(0);
		
		System.out.println((int)chr);
	}
}
