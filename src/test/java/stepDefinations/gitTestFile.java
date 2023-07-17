package stepDefinations;

import java.util.ArrayList;

public class gitTestFile {

	public static void testMethod() {

		System.out.println("Your Assignment:");
		System.out.println("1. Write a java prg to fine 2nd largest integer in a array of integers");
		System.out.println(
				"2. Reverse a String without changing order Ex.Ankit is learning skills Output:tiknA si gninrael  slliks");
		System.out.println(": )");
	}

	public static void findSecondLartgestInteger() {

		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(24);
		intArray.add(22);
		intArray.add(100);
		intArray.add(54);
		intArray.add(32);

		int tempvar = 0;

		int Arraysize = intArray.size();
//Rewirte this prg by using one for loop only one iteration needed
		for (int i = 0; i < Arraysize; i++) {

			for (int j = i + 1; j < Arraysize; j++) {

				if (intArray.get(i) > intArray.get(j)) {
					tempvar = intArray.get(i);
					intArray.set(i, intArray.get(j));
					intArray.set(j, tempvar);

				}

			}

			if (i == (Arraysize - 1)) {
				System.out.println(intArray.get(Arraysize - 2));
				break;
			}

		}

	}
	
	public static char[] getCharactersOfString(String words) {
		
		char[] result = words.toCharArray();
		for (int i = result.length -1; i <= result.length; i--) {
			System.out.println(result[i]);
		}
		
		return result;
	}

}
