package iterationControl;


//Implement a program to check whether a given number is a lucky number.
//
//A lucky number is a number whose sum of squares of every even-positioned digit (starting from the second position) is a multiple of 9.
//
//E.g. - 1623 = 62+32 = 45 is a multiple of 9 and hence is a lucky number

public class Assignment_6 {
	public static void main(String[] args) {
		int num = 15;
		double power=1;
		int n=0;
		int sum=0;
		String s = Integer.toString(num);
		for(int i=1;i<s.length();i++) {
			if(i%2!=0) {
				n = Character.getNumericValue(s.charAt(i));
				//System.out.println("n:::"+ n);
				power = Math.pow(n, 2);
				//System.out.println("power:::"+ power);
				sum+=power;
			}
		}
		//System.out.println(sum);
		if(sum%9==0) {
			System.out.println("The number "+num+ " is an lucky number");
		}else {
			System.out.println("The number "+num+ " is not an lucky number");

		}
	}
}
