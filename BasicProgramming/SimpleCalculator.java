package learning;
 
import java.util.*;
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num_1: ");
		int num1 = input.nextInt();
		System.out.print("Enter num_2: ");
		int num2= input.nextInt();
		System.out.print("Enter the operation need to be performed : ");
		char operator = input.next().charAt(0);
		//System.out.print(operator);
		int result = 0;
		if(operator == '+' ) {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator=='*') {
			result = num1 * num2;
		}
		else if(operator=='/') {
			result = num1 /num2;
		}
		else {
			System.out.println("Please enter valid operator!!!!");
		}
		System.out.format("%d %c %d = %d",num1,operator,num2,result);
		System.out.println();
		System.out.format("The output is %d",result);
	}

}
