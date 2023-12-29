package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class String08 {

/*	WAP to remove all leading and trailing spaces */
	
	static void removeSpaces(String s) {
		//System.out.println(s.trim());
		int i = 0; int j = s.length()-1;
		while(s.charAt(i) == ' ') {
			i++;
		}
		while(s.charAt(j) == ' ') {
			j--;
		}
		for (int j2 = i; j2 <= j; j2++) {
			System.out.print(s.charAt(j2));
		}
	}
	
/* wap in java to print string with concatenation of sum of all numeric characters in end */
	
	static void printString(String s ) {
		
		String res =""; int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum = sum + (s.charAt(i) - 48);
			}else {
				res += s.charAt(i);
			}
		}
		System.out.println(res + sum);
	}
	
/*	wap to sort the string */
	
	static void sortedString(String s) {
		
		char [] arr = s.toCharArray();
		Arrays.sort(arr);
		String res = new String(arr);
		System.out.println(res);
		
//		for (int j = 0; j < arr.length; j++) {
//			
//			System.out.print(arr[j]);
//		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		//removeSpaces(str);
		//printString(str);
		sortedString(str);
		sc.close();
	}
}
