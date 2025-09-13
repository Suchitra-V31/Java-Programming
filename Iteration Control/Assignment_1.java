package iterationControl;

//Implement a program to check whether a given number is a palindrome.
//
//Palindrome is a sequence that reads the same backwards as forwards.
//
//E.g.: 121, 1331, 2332, 78900987, 123456654321,  etc.

import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String reversedNum = "";
		int unitDigit = 0;
		int temp = num;
		while(temp>0) {
			unitDigit = temp%10;
			reversedNum += unitDigit;
			temp/=10;
		}
		int reverseNum = Integer.parseInt(reversedNum);
		//System.out.println(reverseNum)
;		if(num == reverseNum) {
			System.out.println(num+" is a pallindrome");
		}
		else {
			System.out.println(num + " is not a pallindrome");
		}
        s.close();
		
	}
}
