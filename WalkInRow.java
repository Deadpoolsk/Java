import java.util.Scanner;

public class WalkInRow {

	static int totalWidth(int k ,int [] arr) {
		
		int width = 0;
		for (int i = 0; i < arr.length; i++) {
			if( arr[i] <= k) {
				width++;
			}else {
				width += 2;
			}
		}
		return width;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		int res = totalWidth(k,arr);
		System.out.println(res);
		sc.close();

	}

}
