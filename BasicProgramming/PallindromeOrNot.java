package learning;

import java.util.*;

public class PallindromeOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = input.next();
		char ch;
		String r="";
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			r = ch + r;	
		}
		System.out.println(r);
		if(r.equals(s)) {
			System.out.format("%s is a pallindrome",s);
		}
		else {
			System.out.format("%s is not a pallindrome",s);
		}
		
		
	}

}
