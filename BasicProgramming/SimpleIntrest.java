package learning;
import java.util.*;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the principal amount : ");
		int P = input.nextInt();
		System.out.print("Enter the rate of intrest amount : ");
		int r = input.nextInt();
		System.out.print("Enter the time amount : ");
		int t = input.nextInt();
		int S_I = (P*r*t)/100;
		System.out.print("The S.I value is "+ S_I);
	}

}
