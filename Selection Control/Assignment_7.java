package selectionControl;

//Implement a program to generate and display the next date of a given date.

import java.util.Scanner;

public class Assignment_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter date::: ");
		int date = s.nextInt();
		System.out.print("Enter month::: ");
		int month = s.nextInt();
		System.out.print("Enter year::: ");
		int year = s.nextInt();
		if(month==12 && date==31) {
			date = 1;
			month = 1;
			year++;
		}else {
			if((month == 4 || month == 6 || month ==9 || month == 11)&& (month !=2)){
				if(date<30) {
					date++;
				}
				else {
					date = 1;
					month++;
				}
			}
			else if(month == 2) {
			    boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
			    int maxDays = leap ? 29 : 28;
				if(date<maxDays) {
					date++;
				}else {
					date=1;
					month++;
				}
			}
			else {
				if(date<31) {
					date++;
				}else {
					date=1;
					month++;
				}
			}
		}
		System.out.println(date+ "-" + month + "-" + year);
	}
}
