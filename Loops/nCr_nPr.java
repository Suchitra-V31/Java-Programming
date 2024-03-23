package Loops;
import java.util.*;
public class nCr_nPr {
	public static int factorial(int num) {
		int p=1;
		for(int i=1;i<=num;i++) {
			p*=i;
		}
		return p;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter r: ");
		int r = input.nextInt();
		int n_factorial = factorial(n);
		int r_factorial = factorial(r);
		int n_r_factorial = factorial(n-r);
		int denominator = r_factorial * n_r_factorial;
		int n_C_r = n_factorial / denominator;
		int n_P_r = n_factorial / n_r_factorial;
		System.out.println("nCr = "+ n_C_r);
		System.out.print("nPr = "+ n_P_r);
	}
	
}
