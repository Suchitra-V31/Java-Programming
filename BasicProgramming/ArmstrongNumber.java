package learning;

public class ArmstrongNumber {
	static void find_sum(int x) {
		String s = Integer.toString(x);
		int sum=0;
		int unit_digit;
		int temp = x;
		while(x!=0) { //243
			int len = s.length();
			int cube=1;
			//System.out.println("x " + x);
			unit_digit = x %10; //3
			//System.out.println("u_d " + unit_digit);
			while(len!= 0) {
				cube *= unit_digit;  // 3*3=9*3 = 27
				--len; //2
			}
			//System.out.println("cube " + cube);
		    sum +=  cube;
		    x/=10; 
		}
		//System.out.println("sum " + sum);
		if(sum ==temp) {
			System.out.format("%d is an Armstrong number",temp);
			System.out.println();
		}
		else {
			System.out.format("%d is not an Armstrong number",temp);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int[] l ={243,153}; // Declare an array
		for(int i=0;i<2;i++) {
			find_sum(l[i]); // call function
		}
		//System.out.println(num1%10); // Provides unit digit
		//System.out.println(num1/10); // Remove unit digit
		//System.out.println(num1%100); // Provides last two digit

	}
}
