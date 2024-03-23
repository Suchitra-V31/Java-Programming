package Loops;
import java.util.*;
public class DepriciationOfValue {
	public static void main(String[] args) {
	       Scanner input= new Scanner(System.in);
	       float v1=input.nextInt();
	       float r = input.nextInt();
	       float t=input.nextInt();
	       float s = 1-r/100;
	       float p = 1;
	       for(int i=1;i<=t;i++){
	           p*=s;
	       }
	       float v2 = v1*p;
	       System.out.print(v2);
	}

}
