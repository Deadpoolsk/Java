/*
 * WAP in java to extract and print all characters present at odd and even index
 * in string according to original order
 */

package Strings;

import java.util.Scanner;

public class String05 {
	
	static void oddIndexChar(String str) {
		System.out.println("odd index characters :");
		for (int i = 1; i < str.length(); i= i+2) {
			//if( i % 2 != 0) {
				System.out.print(str.charAt(i) + " ");
			//}
		}
	}
	static void evenIndexChar(String str) {
		System.out.println("even index characters :");
		for (int i = 0; i < str.length(); i= i+2) {
			System.out.print(str.charAt(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		oddIndexChar(str);
		System.out.println();
		evenIndexChar(str);
		sc.close();		
	}
}
