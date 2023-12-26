import java.util.Scanner;

public class IntTORoman {

	// Java program for the above approach
	  static String integerToRoman(int num)

	  {
	//Initialize the ans string
	    String ans = "";
	  //calculate the roman numbers
	    while (num>0) {
	        if (num >= 1000) {
	            ans += "M";
	            num -= 1000;
	        }
	      //check for all the corner cases like 900,400,90,40,9,4 etc.
	        else if (num >= 900 && num < 1000) {
	            ans += "CM";
	            num -= 900;
	        }
	        else if (num >= 500 && num < 900) {
	            ans += "D";
	            num -= 500;
	        }
	        else if (num >= 400 && num < 500) {
	            ans += "CD";
	            num -= 400;
	        }
	        else if (num >= 100 && num < 400) {
	            ans += "C";
	            num -= 100;
	        }
	        else if (num >= 90 && num < 100) {
	            ans += "XC";
	            num -= 90;
	        }
	        else if (num >= 50 && num < 90) {
	            ans += "L";
	            num -= 50;
	        }
	        else if (num >= 40 && num < 50) {
	            ans += "XL";
	            num -= 40;
	        }
	        else if (num >= 10 && num < 40) {
	            ans += "X";
	            num -= 10;
	        }
	        else if (num == 9) {
	            ans += "IX";
	            num -= 9;
	        }
	        else if (num >= 5 && num < 9) {
	            ans += "V";
	            num -= 5;
	        }
	        else if (num == 4) {
	            ans += "IV";
	            num -= 4;
	        }
	        else if (num < 4) {
	            ans += "I";
	            num--;
	        }
	    }
	  //return the result
	    return ans;
	}

	  static String intToRo(int num){
		  int [] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		  String [] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		  StringBuilder res = new StringBuilder();
		  for (int i = 0; i < arr.length; i++) {
			while (num >= arr[i]) {
				res.append(str[i]);
				num -= arr[i];
			}
		  }
		  return res.toString();
	  }
	  
	// Driver program to test above function
	  public static void main(String[] args)
	  {
	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter the number :");
//	    int num = sc.nextInt();
//	    System.out.println("Roman number of given number is : " + intToRo(num));
	    System.out.println("Enter the first number :");
	    int a = sc.nextInt();
	    System.out.println("Enter the Second number :");	    
	    int b = sc.nextInt();
	    System.out.println("Roman numbers between given numbers are :");
	    for(int i = a; i <= b; i++) {
	    	if( i > 0) {
	    		System.out.println(i + "-" +intToRo(i)); 
	    	}
	    }
	    sc.close();
	  }
	}

