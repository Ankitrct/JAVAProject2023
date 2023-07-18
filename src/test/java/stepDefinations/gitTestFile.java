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
		intArray.add(222);
		intArray.add(100);
		intArray.add(542);
		intArray.add(32);

		int maxValue = Integer.MIN_VALUE;
		int secondhighestValue = Integer.MIN_VALUE;

		for (int i = 0; i < intArray.size(); i++) {

			if (intArray.get(i) > maxValue) {

				secondhighestValue = maxValue;

				maxValue = intArray.get(i);

			} else if (intArray.get(i) > secondhighestValue) {

				secondhighestValue = intArray.get(i);

			}

		}

		// System.out.println(secondhighestValue);
		// System.out.println(maxValue);

	}

	public static StringBuilder getReverseString(String[] words, StringBuilder sentence) {

		String indvidualWord;
		for (int i = 0; i < words.length; i++) {
			indvidualWord = words[i];		

			for (int j = indvidualWord.length() - 1; j >= 0; j--) {
				sentence.append(indvidualWord.charAt(j));
			}
			sentence.append(" ");

		}

		return sentence;
	}

}
