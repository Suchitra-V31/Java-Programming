// Pattern - 28
public class Pattern_28 {

	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<2*n;row++) {
			int c=0;
			if(row<=n) {
				c=row;
			}
			else {
				c = n-(row-n);
			}
			
			int spaces = n-c;
			for(int s=0;s<spaces;s++) {
				System.out.print(" ");
			}
			
			for(int col=1;col<=c;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		
	}

}
