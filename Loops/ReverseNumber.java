package Loops;
import java.util.*;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = input.nextInt();
		int reverse_num=0;
		while(num!=0) {
			int rem = num%10;
			num/=10;
			reverse_num = reverse_num*10 + rem;
		}
		System.out.print("Reverse number is " + reverse_num);
		
	}

}
