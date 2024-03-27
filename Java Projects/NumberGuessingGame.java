package Projects;
import java.util.*;
public class NumberGuessingGame {
	public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);
        //System.out.println(num);
        System.out.println("GUESSING GAME!!!! Come Let's Play...");
        System.out.println("Guess a number between 1 to 100!!!");
        int n=0;
        while(n<=10) {
            System.out.print("Enter guess : ");
            Scanner in = new Scanner(System.in);
            int guess = in.nextInt();
            n++;
            if(guess >100){
                System.out.println("Please enter number between 1 to 100...");
            }
            else{
                if(guess == num){
                    System.out.println("COngratulations!! You guessed correctly...");
                    break;
                }
                else if(guess > num){
                    System.out.println("Oops!!!Your guess is too high..");
                }
                else if(guess < num){
                    System.out.println("Oops!!!Your guess is too low..");
                }
            }

        }
        if(n>10){
            System.out.println("OOPS!!! Your chances are over...");
        }
   
        
    }

}
