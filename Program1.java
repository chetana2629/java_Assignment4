/*Write a Java program that compares two wrapper objects for equality and demonstrates 
when to use equals() instead of == (try with Integer or Float classes)*/
package javaAssignment4;

public class Program1 {

	public static void main(String[] args) {

		int a = 100;
		Integer wi = a;

		float b = 123.15f;
		Float wf = b;

		System.out.println(" Object of wrapper classes are not equal :" + wi.equals(wf));
		
	}

}
