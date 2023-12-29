
package Strings;

import java.util.Scanner;

public class String06 {
	
/*	WAP to reverse a string		*/
	
	static String reverse (String s) {
	
		String res = "";
		for (int i = 0, j = s.length()-1; i < s.length(); i++) {
			//res =  s.charAt(i) + res ;
			res += s.charAt(j--);
		}
		return res;
	}
	
/*	WAP to check whether string is palindrome */

	static String checkPalindrome(String s) {
		
//		String res = reverse(s);
//		if(res.equals(s)) {			
//			return "palindrome";
//		}else {
//			return "not palindrome";
//		}
		int i = 0, j = s.length()-1;
		while(i < j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}else {
				return "not palindrome";				
			}
		}
		return "palindrome";
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		//System.out.println("reversed string = " + reverse(str));
		System.out.println(checkPalindrome(str));
		sc.close();
	}
	
}
