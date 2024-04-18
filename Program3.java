
package javaAssignment4;

public class Program3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Chetana");
		StringBuilder sb1 = new StringBuilder("Patil");
		StringBuilder s = (new StringBuilder()).append(sb).append(sb1);
		System.out.println("String 1" + sb);
		System.out.println("String 2 :" + sb1);
		System.out.println("After String Concatenation :" + s);

	}

}
