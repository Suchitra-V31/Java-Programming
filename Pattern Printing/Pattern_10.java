// Pattern-10
public class Pattern_10 {
	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++) {
			int spaces = n-row;
			for(int i=0;i<=spaces;i++) {
				System.out.print(" ");
			}
			for(int col=0;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
