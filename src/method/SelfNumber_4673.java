package method;

public class SelfNumber_4673 {

	public static void main(String[] args) {
		int[] numbers = new int[10000];

		setNumbers(numbers);

		getSelfNumber(numbers);

		for (int x : numbers) {
			if (x != 0) {
				System.out.println(x);
			}
		}

	}

	static void setNumbers(int[] numbers) {
		for (int i = 0; i < 10000; i++) {
			numbers[i] = i + 1;
		}
	}

	static void getSelfNumber(int[] numbers) {

		String tmpStr = null;
		int tmp = 0;
		int[] tmpArr = new int[10000];

		for (int i = 0; i < 10000; i++) {
			tmp = numbers[i];
			tmpStr = Integer.toString(numbers[i]);

			for (int j = 0; j < tmpStr.length(); j++) {
				tmp = tmp + Character.getNumericValue(tmpStr.charAt(j));
			}
			tmpArr[i] = tmp;
		}

		for (int i = 0; i < tmpArr.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == tmpArr[i]) {
					numbers[j] = 0;
				}
			}
		}

	}

}
