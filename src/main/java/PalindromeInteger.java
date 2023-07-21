import java.util.ArrayList;

public class PalindromeInteger {

	public static void main(String[] args) {

		// Write a prg to find a Palindrome Number. Ex. 16461 Output: True

		ArrayList<Integer> listofNumbers = new ArrayList<Integer>();
		listofNumbers.add(123);
		listofNumbers.add(10);
		listofNumbers.add(16461);
		listofNumbers.add(121);
		listofNumbers.add(33456);

		boolean flag = false;

		for (int i = 0; i < listofNumbers.size(); i++) {

			StringBuilder readForward = new StringBuilder();
			StringBuilder readBackword = new StringBuilder();

			String number = listofNumbers.get(i).toString();
			System.out.println("checking for --" + number);

			for (int j = 0; j < number.length(); j++) {

				readForward.append(number.charAt(j));

			}

			for (int k = number.length() - 1; k >= 0; k--) {

				readBackword.append(number.charAt(k));

			}

			if (readForward.toString().equals(readBackword.toString())) {
				flag = true;
				System.out.println(number + " is Palindrome");
				System.out.println("-------------------------");
			} else {
				System.out.println(number + " is NOT Palindrome");
				System.out.println("-------------------------");

			}

		}

		if (flag)
			System.out.println("The list have Palindrome number");
		else
			System.out.println("The list DO NOT have any Palindrome number");

	}

}
