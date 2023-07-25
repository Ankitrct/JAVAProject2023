import java.util.ArrayList;
//***************REWRITE THIS PRG WITHOUT CHANGING THE NUMBER TO A STRING ******************
//HINT: USE % AND / TO REVERSE A NUMBER

public class PalindromeInteger {

	public static void main(String[] args) {

		// Write a prg to find a Palindrome Number. Ex. 16461 Output: True

		ArrayList<Integer> listofNumbers = new ArrayList<Integer>();
		listofNumbers.add(123);
		listofNumbers.add(10);
		listofNumbers.add(12621);
		listofNumbers.add(121);
		listofNumbers.add(33456);

		int org_num = 0;
		int rev, num;

		for (int i = 0; i < listofNumbers.size(); i++) {

			rev = 0;
			num = 0;
			num = listofNumbers.get(i);
			org_num = num;

			while (num != 0) {

				rev = rev * 10 + num % 10;

				num = num / 10;

				//System.out.println("Org num " + org_num + "  rev number  " + rev);
			}

			if (org_num == rev)
				System.out.println("Number is Palindrome " + org_num);
			else
				System.out.println("Number is NOT Palindrome " + org_num);
		}

	}

}
