import java.util.Scanner;

public class MergeSortedArray {

	static int [] mergedArray(int [] arr1, int [] arr2) {
		int [] res = new int [arr1.length + arr2.length];
		int i = 0 , j = 0 , k = 0;
		while ( i < arr1.length && j < arr2.length) {
			
			if(arr1[i] < arr2[j]) {
				res[k++] = arr1[i++];
				
			}else {
				res[k++] = arr2[j++];
				
			}
		}
		while ( i < arr1.length) {
			res[k++] = arr1[i++];
		}
		while ( j < arr2.length) {
			res[k++] = arr2[j++];
		}
		return res;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			
			arr2[i] = sc.nextInt();
		}
		int [] res = mergedArray(arr1,arr2);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		sc.close();
	}

}
