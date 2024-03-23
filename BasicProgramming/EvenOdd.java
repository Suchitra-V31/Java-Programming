package learning;

import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int num = input.nextInt();
		if(num%2 ==0) {
			System.out.format("%d is an even number",num);
		}
		else {
			System.out.format("%d is an odd number",num);
		}
		
	}

}
