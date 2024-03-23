package Loops;

public class LeapYearOrNot {
	public static void IsLeapYear(int year) {
        if(year%100==0){
            System.out.format("%d is a leap year",year);
        }
        else if(year%4==0 && year%100!=0){
             System.out.format("%d is a leap year",year);
        }
        else{
             System.out.format("%d is not a leap year",year);
        }
		
	}
	public static void main(String[] args) {
		int year = 2000;
		IsLeapYear(year);
	}

}
