package method;

import java.util.ArrayList;
import java.util.Arrays;

public class SelfNumber_4673 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList <Integer>();
		int[] numbers = new int[10000];
		
		getNumbers(numbers);
		

		getSelfNumber(numbers, arr);
		
		
		
		
	}
	
	static void getNumbers(int[] numbers) {
		for(int i = 0; i < 10000; i++) {
			numbers[i] = i + 1;			
		}
	}
	
	static void getSelfNumber(int[] numbers, ArrayList<Integer> arr) {
		
		String tmpStr = null;
		int tmp;
		
		for (int i = 0; i < 10000; i++) {
			tmp = 0;
			tmp = numbers[i];
			tmpStr = Integer.toString(i+1);
			
			for (int j = 0; j < tmpStr.length(); j++) {
				tmp = tmp + Character.getNumericValue(tmpStr.charAt(j)); 
			}

			if(tmp > 10000) {
				break;
			}
			numbers[tmp - 1] = 0;
		}
		System.out.println(Arrays.toString(numbers));
		
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[i] != 0) {
//				System.out.println(numbers[i]);
//			}
//		}
	}
	
}


