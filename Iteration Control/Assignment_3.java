package iterationControl;

//Implement a program to find out whether a number is divisible by the sum of its digits. 
import java.util.Scanner;
public class Assignment_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = num;
		int unitDigit=0;
		int sum =0;
		while(temp>0) {
			unitDigit = temp%10;
			sum+=unitDigit;
			temp/=10;
		}
		if(num%sum==0) {
			System.out.println(num + " is divisible by sum of digits");
		}
		else {
			System.out.println(num + " is not divisible by sum of digits");
		}
		s.close();
	}
}
