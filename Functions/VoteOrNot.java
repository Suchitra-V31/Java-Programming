package Functions;
import java.util.*;
public class VoteOrNot {
	public static void IsEligible(int n) {
		if(n>=18) {
			System.out.print("Congratrulations!!!!!!!! You are eligible to vote");
		}
		else {
			System.out.print("OOPS!!!!!!!! You are not eligible to vote");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int n = input.nextInt();
		IsEligible(n);
	}

}
