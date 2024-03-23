package Loops;
import java.util.*;
public class ElectricityBillCaluculation {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter amount of kwh units: ");
		int u = input.nextInt();
		int bill=1;
		if(u<100) {
			bill = u*10;
		}
		else if(u>=100 && u<200) {
			bill = (100*10)+(u-100)*15;
		}
		else if(u>=200 && u<300) {
			bill = (100*10)+(100*15)+(u-200)*20;
		}
		else if(u>=300) {
			bill = (100*10)+(100*15)+(100*20)+(u-300)*25;
		}
		System.out.print("Electricity bill = "+ bill);
		
	}

}
