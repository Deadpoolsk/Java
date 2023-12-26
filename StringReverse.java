import java.util.Scanner;

public class StringReverse {
	
	static String reverse(String s) {
		
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			t = s.charAt(i) + t;
		}
		return t;
	}
	
	static boolean isPalindrome(String s) {
		
//		String t = "";
//		for (int i = 0; i < s.length(); i++) {
//			t = s.charAt(i) + t;
//		}
//		
//		return s.equals(t) ? true : false;
		int i = 0 , j = s.length() - 1;
		while ( i < j) {
			if( s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isPalindrome(s));
		sc.close();
	}

}
