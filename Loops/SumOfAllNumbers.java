package Loops;
import java.util.*;
public class SumOfAllNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter number: ");
		//int num = input.nextInt();
		//int s=num;
		int s=0;
		while(true) {
			System.out.print("Enter number: ");
			int num=input.nextInt();
			if(num==0) {
				break;
			}
			s+=num;
		}
		System.out.println("Sum : "+s);
	}

}
