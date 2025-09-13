package iterationControl;

public class Assignment_2 {
	 public static void main(String[] args) {
		 int head =150;
		 int legs = 500;
		 int extraLegs = legs-(head*2) ;
		 int rabbits = extraLegs/2;
		 int chicken = head - rabbits;
		 System.out.println("Chickens="+chicken +
		 "Rabbits="+ rabbits);
	 }
}
