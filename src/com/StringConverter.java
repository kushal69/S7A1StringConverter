package com;

import java.util.Scanner;

//	Main String Converter Class
public class StringConverter {

	//	Main Method
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);										//	Scanner Class object to get the User Input
		int integerValue = 0;															//	Variable to store integer value
		String stringValue = "";														//	Variable to store String value

		System.out.print("Enter an Integer value to convert to String : ");
		integerValue = userInput.nextInt();												//	Getting the integer value from the user

		stringValue = String.valueOf(integerValue);										//	Converting the integer to String using String Class in-built function

		System.out.print("Converted string Value of entered Int is : " + stringValue);	//	Printing the String value
		userInput.close();																//	Closing the Scanner stream
	}
}