package iterationControl;

//Implement a program to find out whether a number is a seed of another number.
//
//A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.
//
//E.g.: 123 is a seed of 738 as 123*1*2*3 = 738

public class Assignment_4 {
	public static void main(String[] args) {
		int num1 = 45;
		int temp = num1;
		int num2 = 1000;
		int unitDigit = 0;
		int product = num1;
		while(temp>0) {
			unitDigit = temp%10;
			product *= unitDigit;
			temp/=10;
		}
		if(product == num2) {
			System.out.println(num1+" is a seed of "+ num2);
		}
		else {
			System.out.println(num1+" is not a seed of "+ num2);
		}
	}
}
