package iterationControl;

// lCM of 2 numbers

public class Assignment_7 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2=10;
		int product = num1*num2;
		int gcd = gcd(num1,num2);
		int lcm = product/gcd;
		System.out.println(lcm);

	}
    static int gcd(int a, int b) {
    	if (b == 0) return a;
    	return gcd(b, a % b);
    }

}
