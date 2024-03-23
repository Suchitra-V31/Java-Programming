package Loops;
import java.util.*;
public class CGPAPercentage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = input.nextInt();
		double[] arr = new double[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter marks: ");
			int num = input.nextInt();
			arr[i]= num/10;
		}
		double s=0;
		for(int i=0;i<n;i++) {
			//System.out.println(arr[i]);
			s+=arr[i];		
		}
		double cgpa = s/n;
		double cgpa_percent = cgpa * 9.5;
		System.out.println("CGPA = "+ cgpa);
		System.out.print("CGPA % = "+String.format("%.2f",cgpa_percent));
	}

}
