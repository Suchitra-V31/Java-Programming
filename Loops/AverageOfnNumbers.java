package Loops;
import java.util.*;
public class AverageOfnNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = input.nextInt(); 
		int temp = n;
		int s=0;
		while(n!=0) {
			System.out.print("Enter number : ");
			int num = input.nextInt();
			s+=num;
			n--;
		}
		int avg = s/ temp;
		System.out.format("Average of %d numbers = %d",temp,avg);
	}

}
