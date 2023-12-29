/*
 * WAP in java to print character present at k index
 * if not present print "invalid index" 
 */

package Strings;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Enter the index number");
		int k = sc.nextInt();
		if (k >= 0 && k < str.length()) {			
			System.out.println(str.charAt(k));
		} else {
			System.out.println("invalid index");			
		}
		sc.close();
	}
}
