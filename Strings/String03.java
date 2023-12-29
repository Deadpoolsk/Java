/*
 * Wap in java to concatenate two strings preserving original order
 */

package Strings;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string :");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string :");
		String str2 = sc.nextLine();
		System.out.println(str1 + " " + str2);
		sc.close();
	}

}
