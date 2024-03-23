package Loops;
import java.util.*;
public class SubtracttheProductandSumofDigitsofanInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		int s=0,p=1;
		while(num!=0) {
			int rem=num%10;
			s+=rem;
			p*=rem;
			num/=10;
		}
		int diff=p-s;
		System.out.print("Difference = "+diff);
	}

}
