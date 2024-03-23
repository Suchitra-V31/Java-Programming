package learning;
import java.util.*;
public class RupeesToDollar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Rupees (Rs.): ");
		int INR = input.nextInt();
		float USD =  INR * 0.012f;
		System.out.format("%d INR = %f USD",INR,USD);
		
	}

}
