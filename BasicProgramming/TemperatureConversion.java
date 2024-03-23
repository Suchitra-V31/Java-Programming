package learning;

import java.util.*;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius : ");
		float temp = input.nextFloat();
		float result = (temp*9/5) + 32;
		System.out.print("Celsius to Farenheit : "+ result);
		
	}
}
