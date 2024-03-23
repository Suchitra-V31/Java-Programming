package learning;
import java.util.*;
public class LargestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int num_1 = input.nextInt();
		System.out.print("Enter number 2 : ");
		int num_2 = input.nextInt();
		if(num_1 > num_2) {
			System.out.format("%d is the largest number",num_1);
		}
		else {
			System.out.format("%d is the largest number",num_2);
		}
		
	}

}
