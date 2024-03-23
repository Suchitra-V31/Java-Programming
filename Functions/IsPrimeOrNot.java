package Functions;
import java.util.*;
public class IsPrimeOrNot {
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
		Scanner input = new Scanner(System.in);
		System.out.print("Enter start range : ");
		int a = input.nextInt();
		System.out.print("Enter end range : ");
		int b = input.nextInt();
		for(int i=a;i<=b;i++) {
			boolean r = IsPrime(i);
			if(r) {
				System.out.format("%d is a prime number",i);
				System.out.println();
			}
//			else {
//				System.out.format("%d is not a prime number",i);
//				System.out.println();
//			}
		}
	}

}
