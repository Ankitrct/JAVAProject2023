package stepDefinations;

import io.cucumber.java.en.Given;

public class InterviewTaskstepDef {

	@Given("find second largest integer")
	public void find_second_largest_integer() {
		gitTestFile.findSecondLartgestInteger();
	}

	@Given("Reverse a String without changing order")
	public void reverse_a_string_without_changing_order() {

		String sourceVal = "Coding is fun";
		String[] words = sourceVal.split(" ");
		String indvidualWord;

		StringBuilder stb = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {
			indvidualWord = words[i];
			//gitTestFile.getCharactersOfString(indvidualWord);
			
			char[] result = indvidualWord.toCharArray();
			for (int j = result.length -1; j >=0; j--) {
				stb.append(result[i]);
			}
			stb.append(" ");

		}
		
		System.out.println(stb);

	}

}
