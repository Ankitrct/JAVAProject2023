import java.util.Scanner;

public class HighestInteger {
	
	public static int getShighest(int[] intArray) {
		
		int maxValue = Integer.MIN_VALUE;
		int secondhighestValue = Integer.MIN_VALUE;

		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] > maxValue) {
				secondhighestValue = maxValue;
				maxValue = intArray[i];

			} else if (intArray[i] > secondhighestValue) {
				secondhighestValue = intArray[i];
			}
		}
		
		return secondhighestValue;	
		
		
	}
	
//This will help to run code multiple times with different input to check its stability.
		
	public static void main(String[] args) {
		System.out.println("Enter 10 Integer values:\n");
		Scanner input = new Scanner(System.in);	
		int[] intArray=new int[10];
		 for(int index=0;index<10;index++) {
			int num= input.nextInt();
			intArray[index]=num;
		 }
		 
		 System.out.println("Second Highest Integer:"+ getShighest(intArray));
	}
}
