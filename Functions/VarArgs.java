package Functions;

import java.util.Arrays;

public class VarArgs {
		static void	 fun (int ...v) { // to get multiple inputs of type int 
		System.out.println(Arrays.toString(v));
		}
		public static void main(String[] args) {
		fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
		
		}

}
