package cmldg;

import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 1 for Consecutive Numbers, Enter 2 for Compute Grade, Enter 3 for Integer add, and 0 to Exit");
		int sentinel = sc.nextInt();
		while (sentinel != 0) {
		// Consecutive Numbers
			while(sentinel == 1) {
				System.out.println("Enter the first number: ");
				int n1 = sc.nextInt();
				System.out.println("Enter the second number: ");
				int n2 = sc.nextInt();
				System.out.println("Enter the third number: ");
				int n3 = sc.nextInt();
				System.out.println("Enter the first number: ");
				System.out.println("The three numbers are consecutivE: " + isConsecutive(n1,n2,n3));
				System.out.println("Enter 1 for Consecutive Numbers, Enter 2 for Compute Grade, Enter 3 for Integer add, and 0 to Exit");
				sentinel = sc.nextInt();
			}
			while(sentinel == 2) {
				// Compute Grade
				System.out.println("Enter written task grade: ");
				int num1 = sc.nextInt();
				System.out.println("Enter performance task grade: ");
				int num2 = sc.nextInt();
				System.out.println("Enter exam grade: ");
				int num3 = sc.nextInt();
				System.out.println("Your overall grade is: " + computeGrade(num1,num2,num3));
				if (isPass(computeGrade(num1,num2,num3)))
					System.out.println("Congratulations, you've passed!");
				else
					System.out.println("Sorry, you've failed...");
				System.out.println("Enter 1 for Consecutive Numbers, Enter 2 for Compute Grade, Enter 3 for Integer add, and 0 to Exit");
				sentinel = sc.nextInt();
			}
			while(sentinel == 3) {
				// Integer Add
				System.out.println("Input an Integer: ");
				int nu = sc.nextInt();
				System.out.println("The sum is: "+ (int)sumInt(nu));
				System.out.println("Enter 1 for Consecutive Numbers, Enter 2 for Compute Grade, Enter 3 for Integer add, and 0 to Exit");
				sentinel = sc.nextInt();
			}
		
		}
		
	}	
	// Consecutive Numbers
	static boolean isConsecutive(int x, int y, int z) {
		if (x + 1 == y && x + 2 == z || x + 1 == z && x + 2 == y)
			return true;
		else if (y + 1 == x && y + 2 == z || y + 1 == z && y + 2 == x)
			return true;
		else if (z + 1 == y && z + 2 == x || z + 1 == x && z + 2 == y)
			return true;
		else
			return false;
	}
	// Compute Grade
	static double computeGrade(int wt, int pt, int eg) {
		double x = wt * 0.20;
		double y = pt * 0.60;
		double z = eg * 0.20;
		
		return x + y + z;
	}
	
	static boolean isPass(double x) {
		if (x > 75)
			return true;
		else
			return false;
	}
	// Integer Add
	static double sumInt(int x) {
		double whole = x * 0.10;
		double dec = whole%1;
		double z = dec/0.10;
		return whole + z;
	}
	
	
}
