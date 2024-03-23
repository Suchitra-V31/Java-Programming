package Functions;
import java.util.*;
public class EvenOrOdd {
	public static void IsEvenOdd(int n) {
		if(n%2==0) {
			System.out.format("%d is even number",n);
		}
		else {
			System.out.format("%d is not an even number",n);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		IsEvenOdd(n);
	}

}
