package Loops;
import java.util.*;
public class Distancebw2Points {
	 public static double square(double number){
		    double t;
		    double squareroot = number / 2;
		    do {
		        t = squareroot;
		        squareroot = (t + (number / t)) / 2;
		    } while ((t - squareroot) != 0);
		  
		    return squareroot;
		}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1: ");
		int x1 = input.nextInt();
		System.out.print("Enter x2: ");
		int x2 = input.nextInt();
		System.out.print("Enter y1: ");
		int y1 = input.nextInt();
		System.out.print("Enter y2: ");
		int y2 = input.nextInt();
		int x = x2-x1;
		int y = y2-y1;
		int d = (x*x)+(y*y);
		System.out.print("Distance = "+square(d));
		
	}
}
