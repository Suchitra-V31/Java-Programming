package learning;

import java.util.*;

public class GreetingName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = input.next();
		System.out.print("Hello " + name);
	}
}
