package string;

import java.util.Scanner;

public class Compare_2908 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer result = new StringBuffer();
		String max = null;
		// 입력
		String inp1 = sc.next();
		String inp2 = sc.next();
		
		// 예외
		if(inp1.length() != 3 || inp2.length() != 3) {
			System.out.println("세 자리 입력");
			sc.close();
			return;
		}
		// 비교
		for (int i = inp1.length() -1; i >= 0; i--) {
			
			if (Character.getNumericValue(inp1.charAt(i)) >
			Character.getNumericValue(inp2.charAt(i))) {
				max = inp1;
				break;
			} else if(Character.getNumericValue(inp1.charAt(i)) <
			Character.getNumericValue(inp2.charAt(i))) {
				max = inp2;
				break;
			} 
		}
		// 결과 
		for (int i = max.length() - 1; i >= 0; i--) {
			result.append(max.charAt(i));
		}
		// 출력
		System.out.println(result.toString());
		sc.close();
	}

}
