package Loops;

import java.util.*;

public class CountingOccurences {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int count=0;
		while(num!=0) {
			int rem = num%10;
			if(rem==n) {
				count++;
			}
			num/=10;
		}
		System.out.format("%d has occured %d times",n,count);
	}

}
