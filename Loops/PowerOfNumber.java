package Loops;
import java.util.*;
public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
	    int n=input.nextInt();
	    System.out.print("Enter exponent: ");
	    int r=input.nextInt();
	    int p=1;
	    for(int i=1;i<=r;i++){
	           p*=n;
	    }
	    System.out.print("Power : "+p);
	}
}


