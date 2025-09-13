package iterationControl;


//Implement a program to check whether a given number is an Armstrong number.
//
//An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its individual digits.
//
//E.g.: 371 is an Armstrong number as 33 + 73 + 13=371

public class Assignment_5 {
	public static void main(String[] args) {
		int num = 1635;
		int temp = num;
		int unitDigit = 0;
		int sum = 0;
		double power =1;
		while(temp>0) {
			unitDigit = temp%10;
			power = Math.pow(unitDigit,3);
			sum+=power;
			temp/=10;
		}
		if(sum == num){
			System.out.println(num+" is an Armstrong number");
		}
		else {
			System.out.println(num+" is not an Armstrong number");
		}
			
	}
}
