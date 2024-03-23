package Loops;
import java.util.*;
public class ReverseAString {
	public static String Reverse(String s) {
		String r = "";
		char ch;
		for(int i=s.length()-1;i>=0;i--) {
			ch = s.charAt(i);
			r +=ch;	
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = input.next();
		System.out.print("Reverse of a string is : "+Reverse(s));
		
	}

}
