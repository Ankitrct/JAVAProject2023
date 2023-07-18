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
		System.out.println(sourceVal);

		String[] words = sourceVal.split(" ");

		StringBuilder reversed = new StringBuilder();

		reversed = gitTestFile.getReverseString(words, reversed);

		System.out.println(reversed);

	}

}
