import java.util.Scanner;

public class MigratoryBirds {
	
	static int migrate(int [] arr) {
		
		int [] birds = new int [6];
		for (int i = 0; i < arr.length; i++) {
			birds[arr[i]]++;
		}
		for (int i = 1; i < birds.length; i++) {
			System.out.print(birds[i] + " ");
		}
		System.out.println();
		int maxIndex = 0; int max = 0;
		for (int i = 1; i < birds.length; i++) {
			if( birds[i] > max) {
				max = birds[i];
				maxIndex = i;
			}
		}
		return maxIndex ;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		int res = migrate(arr);
		System.out.println(res);
		sc.close();
	}

}
