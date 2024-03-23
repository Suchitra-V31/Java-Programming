package Functions;
import java.util.*;
public class LargestOfThreeNumbers {
	public static int Maximum(int n1,int n2,int n3) {
		int max = n1; //2
		if(n2>max ) { //3>2
			max = n2;
		}
		if(n3>max) { //5>3
			max = n3;
		}
		return max;
	}
	public static int Minimum(int n1,int n2,int n3) {
		int min = n1; //2
		if(n2<min) { //3<2
			min = n2;
		}
		if(n3<min) { //5<2
			min = n3;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int n1 = input.nextInt();
		System.out.print("Enter num2 : ");
		int n2 = input.nextInt();
		System.out.print("Enter num3 : ");
		int n3 = input.nextInt();
		System.out.println("MAXIMUM : "+Maximum(n1,n2,n3));
		System.out.println("MINIMUM : "+Minimum(n1,n2,n3));
}

}
