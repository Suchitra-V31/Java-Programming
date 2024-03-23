package Loops;

public class PerfectNumberOrNot {
	public static void main(String[] args) {
	       int n = 6;
	       int sum = 0;
	       for(int i=1;i<n;i++){
	           if(n%i==0){
	               sum+=i;
	           }
	       }
	       if(sum == n){
	            System.out.format("%d is a perfect number",n);
	       }
	       else{
	           System.out.format("%d is not a perfect number",n);
	       }
	}

}
