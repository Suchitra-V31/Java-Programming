package Functions;
import java.util.*;
public class PrimeNumberOrNot {
	static boolean IsPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		int n=15;
		boolean r = IsPrime(n);
		if(r) {
			System.out.format("%d is a prime number",n);
		}
		else {
			System.out.format("%d is not a prime number",n);
		}
		
	}

}
