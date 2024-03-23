package Loops;
import java.util.*;
public class ListOfNumbers {
	 public static void result(int[] arr) {
		int negative_sum = 0;
		int positive_even = 0;
		int positive_odd = 0;  
		 for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				negative_sum+=arr[i];
			}
			else if(arr[i]>0 && arr[i]%2==0) {
				positive_even+=arr[i];
			}
			else if(arr[i]>0 && arr[i]%2!=0) {
				positive_odd+=arr[i];
			}
		 }
			System.out.println("Sum of negative numbers :" + negative_sum);
			System.out.println("Sum of positive even numbers :" + positive_even);
			System.out.println("Sum of positive odd numbers :" + positive_odd);
		}
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int[] arr = new int[5];
			int j =0;
			int num;
	        do{
	           System.out.print("Enter the number(enter 0 to end the loop): ");
	           num = input.nextInt();
	           arr[j]=num;
	           j++;
	           
	       }while (num != 0);
	       result(arr);
			
		}

}
