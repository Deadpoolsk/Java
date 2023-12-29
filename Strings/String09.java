package Strings;

import java.util.Scanner;

public class String09 {
	
/*	WAP to convert string into lower case */
	
	static void lowerCase(String s) {
		
//		String res = "";
//		for (int i = 0; i < s.length(); i++) {
//			if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//				res = res +(char) (s.charAt(i) + 32);
//			}else {
//				res += s.charAt(i);
//			}
//		}
//		System.out.println(res);
		
		System.out.println(s.toLowerCase());
	}

/*	WAP to convert string into upper case */
	
	static void upperCase(String s) {
		
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				res = res +(char) (s.charAt(i) - 32);
			}else {
				res += s.charAt(i);
			}
		}
		System.out.println(res);
		
		//System.out.println(s.toUpperCase());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		//lowerCase(str);
		upperCase(str);
		

		sc.close();
		
	}
}
