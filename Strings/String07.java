package Strings;

import java.util.Scanner;

public class String07 {
	
/*	WAP to print only alphabetic characters */
	
	static boolean isAlphabet(char s) {
//			if ( (s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {	
//				return true;			
//			}
//			return false;
			
			return Character.isAlphabetic(s);
		
	}
	
/*	WAP to print only numeric characters */

	static boolean isNumeric(char s) {
			if ( s >= '0' && s <= '9' ) {	
				return true;			
			}
			return false;
		
		//return Character.isDigit(s);
		
	}
	
/*	WAP to print only vowels */
	
	static boolean isVowel(char s) {
		if ( ( s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' )
			||(s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') ) {	
			return true;			
		}
		return false;
	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int count =0;
		
		for (int i = 0; i < str.length(); i++) {
			if(isAlphabet(str.charAt(i)) || isNumeric(str.charAt(i)) ) {
			//	System.out.print(str.charAt(i)+ " ");
				count++;
			}
		}
		
//		for (int i = 0; i < str.length(); i++) {
//			if(isNumeric(str.charAt(i)) ) {
//				System.out.print(str.charAt(i)+ " ");
//				count++;
//			}
//		}
		
//		for (int i = 0; i < str.length(); i++) {
//			if(isVowel(str.charAt(i)) ) {
//				count++;
//			}
//		}
		System.out.println(count);
//		if (count == 0) {
//			System.out.println("no valid character found");
//		}
		sc.close();
	}
}
