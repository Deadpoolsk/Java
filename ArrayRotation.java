import java.util.Scanner;

public class ArrayRotation {
	
	static int [] circularRotation(int k, int [] arr,int [] queries) {
		
		int [] b = new int [arr.length];
		for (int i = 0; i < b.length; i++) {
			b[(i + k) % arr.length] = arr[i];
		}
		int [] res = new int [queries.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = b[queries[i]];
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		int [] queries = new int[q];
		for (int i = 0; i < queries.length; i++) {
			queries[i] = sc.nextInt();
		}
		int [] res = circularRotation(k,arr,queries);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}

}
