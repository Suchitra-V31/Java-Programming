package Loops;
import java.util.*;
public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter length : ");
		int l = input.nextInt();
		System.out.print("Enter width : ");
		int w = input.nextInt();
		int area = (l*w);
		System.out.print("Area of rectangle is "+area);
		
	}
}
