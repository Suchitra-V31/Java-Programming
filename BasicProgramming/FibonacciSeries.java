package learning;

import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] l= new int[20]; // Declare an array	
		l[0]=0;
		l[1]=1;
		int j = 2;
		for(int i=0;i<=n-1;i++) {
			l[j]= l[i]+l[i+1];
			j++;
		}
		for(int i =0;i<=n;i++) {
			System.out.println(l[i]);
		}
	}
}
