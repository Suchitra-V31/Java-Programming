package selectionControl;

import java.util.Scanner;

//Implement a program to determine the eligible loan amount and the EMI that the bank can provide to 
//its customers based on their salary and the loan type they expect to avail.

public class Assignment_5 {
	public static boolean isAccValid(String accountNumber,long accountBalance) {
		if(accountNumber.length()>=4 && accountNumber.charAt(0)== '1' && accountBalance>=1000) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String accountNumber = s.nextLine();
		int salary = s.nextInt();
		long accountBalance= s.nextLong();
		s.nextLine();
		String loanType = s.nextLine();
		//long loanAmountExpected = s.nextLong();
		//int emisExpected = s.nextInt();
		long eligibleLoanAmount = 0;
		int eligibleEmis = 0;
		
		boolean isAccValid = isAccValid(accountNumber,accountBalance);
		if(isAccValid) {
			if(loanType.equalsIgnoreCase("car")&& salary>=25000) {
				eligibleLoanAmount = 500000;
				eligibleEmis = 36;
			}
			else if(loanType.equalsIgnoreCase("house") && salary>=50000) {
				eligibleLoanAmount = 6000000;
				eligibleEmis = 60;
			}
			else if(loanType.equalsIgnoreCase("business") && salary>=75000) {
				eligibleLoanAmount = 7500000;
				eligibleEmis = 84;
			}
			else {
				System.out.println("Your account is not eligible!!!");
			}
			System.out.println("Eligible Loan amount::: "+ eligibleLoanAmount +" Eligible emi::: "+ eligibleEmis);
		}
		else {
			System.out.println("Your acc number or salary is not eligible!!!");
		}
		s.close();
	}
}
