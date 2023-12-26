import java.util.Scanner;

public class AngryProfessor {

	static String angryProf(int k, int [] arr) {
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= 0) {
				count++;
			}
		}
		if(count >= k) {
			return "No";
		}else {
			return "Yes";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		String res = angryProf(k , arr);
		System.out.println(res);
		sc.close();
		
	}

}
