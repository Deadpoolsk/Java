/*	
 * WAP in java to print each character in new line 
 */

package Strings;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		sc.close();
	}

}
