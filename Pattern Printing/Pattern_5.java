
public class Pattern_5 {

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
			for(int col=1;col<=c;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		
	}

}
