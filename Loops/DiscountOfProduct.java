package Loops;
import java.util.*;
public class DiscountOfProduct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchased amount: ");
		int p_amount = input.nextInt();
		System.out.print("Enter discount %: ");
		float discount_percent = input.nextInt();
		float discount = (discount_percent/100)*p_amount;
		System.out.print(discount);
		float s_p =p_amount - discount;
		System.out.print("After discount Selling price = "+s_p);

	}

}
