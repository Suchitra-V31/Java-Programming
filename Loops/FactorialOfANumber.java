package Loops;
import java.util.*;
public class FactorialOfANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		int f =1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		System.out.format("Factorial of %d is %d",n,f);
	}

}
