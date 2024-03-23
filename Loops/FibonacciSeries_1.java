package Loops;
import java.util.*;
public class FibonacciSeries_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = input.nextInt();
		int a =0;
		int b=1;
		int count=2;
		while(count<=n) {
			int temp = b;
			b+=a;
			a=temp;	
			count++;
		}
		System.out.print(b);
		
	}

}
