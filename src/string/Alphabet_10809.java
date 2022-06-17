package string;

import java.util.Scanner;

public class Alphabet_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.next();
		int cnt;
		int[] result = new int[26];
		Character[] alphabet = new Character[26];
		
		for (int i = 0; i < 26; i++) {
			alphabet[i] = (char)(i + 97);
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			cnt = 0;
			for(int j = 0; j < msg.length(); j++) {
				
				if(alphabet[i] == msg.charAt(j)) {
					result[i] = cnt;
					break;
				}
				cnt++;
				result[i] = -1;
			}
		}
		
		for(int x: result) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
