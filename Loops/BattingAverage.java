package Loops;
import java.util.*;
public class BattingAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter runs scored : ");
		int runs = input.nextInt();
		System.out.print("Enter no.of matches played : ");
		int matches = input.nextInt();
		System.out.print("Enter not-out count : ");
		int not_out = input.nextInt();
		int batsman_dismissed = matches - not_out;
		int batting_avg = 0;
		if(batsman_dismissed>0) {
			batting_avg = runs / batsman_dismissed;	
			System.out.print("Batting avg = "+batting_avg);
		}
		else {
			System.out.print("Batting avg = NA");
		}
	}

}
