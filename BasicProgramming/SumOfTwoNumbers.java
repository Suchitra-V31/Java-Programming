package learning;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int num_1 = number.nextInt();
		int num_2 = number.nextInt();
		int result = num_1 + num_2;
		System.out.println("The sum of two numbers is "+ result);
	}

}
