
public class Palindrome {

	public static void main(String[] args) {

		int n = 23336019;

		boolean isPalindrome = checkPalindrome(n, n);
		if (isPalindrome) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("This is not Palindrome");
		}

	}

	private static boolean checkPalindrome(int n, int original) {
		// TODO Auto-generated method stub
		int r, sum = 0, temp;
		int[] numberArray = new int[String.valueOf(n).length()];
		int j = 0;
		temp = n;
		while (n > 0) {
			r = n % 10;
			numberArray[j] = r;
			sum = (sum * 10) + r;
			n = n / 10;
			// System.out.println( "n " + n);
			j++;
		}
		if (temp == sum) {
			return true;
		} else {
			// numberArray = numberArray.
			if (numberArray.length % 2 == 0) {
				StringBuffer buffer = new StringBuffer();
				for (int i = 0; i < numberArray.length; i++) {
					int value = numberArray[i] + numberArray[i + 1];
					buffer.append(value);
					i = i + 1;
				}
				int num = Integer.valueOf(buffer.toString());
				return checkPalindrome(num, num);
			}
		}

		return false;
	}

}
