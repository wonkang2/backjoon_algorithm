package method;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticSequence_1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String temp;
		ArrayList<Integer> diff = new ArrayList<Integer>();
		int chk;;
		int cnt = 0;
		
		
		for (int i = 1; i <= n; i++) {
			chk = 0;
			temp = Integer.toString(i);
			// 각 자리 차 구하기
			for (int j = 0, k = j + 1; k < temp.length(); j++, k++) {
				diff.add(Character.getNumericValue(temp.charAt(j)) - 
						Character.getNumericValue(temp.charAt(k)));
			}
			
			// 각 자리의 차가 동일한지 확인
			for (int j = 0, k = j + 1; k < diff.size(); j++, k++) {
				if (diff.get(j) != diff.get(k) ) {
					chk = 1;
				}
			}
			// 반복 끝날 때마다 arrayList초기화
			diff.clear();
			
			// chk가 0을 유지한다면 등차수열
			if (chk == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
			
	}
}
