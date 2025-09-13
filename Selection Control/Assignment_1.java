package selectionControl;

// Problem statement
//Implement a program to display the sum of two given numbers if the numbers are same. 
//If the numbers are not same, display the double of the sum.

public class Assignment_1 {
	   public static void main(String[] var0) {
		      byte var1 = 6;
		      byte var2 = 5;
		      boolean var3 = false;
		      int var4;
		      if (var1 == var2) {
		         var4 = var1 + var2;
		      } else {
		         var4 = 2 * (var1 + var2);
		      }

		      System.out.println(var4);
		   }
}
