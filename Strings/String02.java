/*
 * Determine length of the strings with white space and characters  
 */

package Strings;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.err.println("length of the given String = " + str.length());
		sc.close();
	}

}
