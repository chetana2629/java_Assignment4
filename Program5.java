//Write a program to calculate the square value of any number given by the user .
//Add an exception handling block to check whether the user enter letters instead of numbers

package javaAssignment4;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		try {
			String num = sc.next();
			int num1 = Integer.parseInt(num);
			int su = num1 * num1;
			System.out.println("Square value of given number:" + su);
		} catch (Exception e) {
			System.out.println("Enter valid input");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
