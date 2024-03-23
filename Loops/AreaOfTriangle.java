package Loops;
import java.util.*;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter breadth : ");
		float b = input.nextInt();
		System.out.print("Enter height : ");
		float h = input.nextInt();
		float area = (b*h)/2;
		System.out.print("Area of triangle is "+area);
		
		
	}
}
