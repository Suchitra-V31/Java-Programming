package Loops;
import java.util.*;
public class VolumeOfCone {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter radius : ");
		float r = input.nextInt();
		System.out.print("Enter height : ");
		float h = input.nextInt();
		double area = (3.14*r*r*h)/3;
		System.out.print("Area of triangle is "+area);
	}

}
