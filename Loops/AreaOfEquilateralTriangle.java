package Loops;
import java.util.*;
public class AreaOfEquilateralTriangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter side : ");
		int a = input.nextInt();
		double root = 1.730/4;
		double area = a*a*root;
		System.out.print("Area of triangle is "+area);
	}

}
