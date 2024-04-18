//Write the Java program that reads an input string and converts it to an integer, handling the exceptions 
//if the input contains non-digits or if the input is larger than what an integer can store:
package javaAssignment4;

import java.util.Scanner;

public class Program10 {
	private static void convertInt(String input) {
		int num = Integer.parseInt(input);
		if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {

		System.out.println("Integer Max Range :" + Integer.MAX_VALUE);
		System.out.println("Integer Min Range :" + Integer.MIN_VALUE);
		try {
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			String num = sc.next();
			convertInt(num);
			System.out.println("The string is converted to integer successfully");
		} catch (IllegalArgumentException e) {
			System.out.println("Number should not be exceed the range of integer");
		}
	}

}
