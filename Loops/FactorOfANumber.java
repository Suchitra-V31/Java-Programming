package Loops;
import java.util.*;
public class FactorOfANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		for(int i=1;i<=num+1;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
//		int[] l = new int[20];
//		int j=0;
//		for(int i=1;i<=num+1;i++) {
//			if(num%i==0) {
//				l[j]=i;
//				j++;
//			}
//		}
//		for(int i=0;i<=l.length;i++) {
//			if(l[i]!=0) {
//				System.out.println(l[i]);
//			}
//		}
	}

}
