package Loops;
import java.util.*;
public class LargestOfAllNumbers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		int largest =num;
		while(num!=0) {
			System.out.print("Enter number: ");
			num=input.nextInt();
			if(num>largest) {
				largest = num;
			}
		}
		System.out.println("Largest number : "+largest);
	}

}

