package Projects;
import java.util.*;
public class RockPaperScissor {
    public static final String rock = "rock";
    public static final String paper = "paper";
    public static final String scissor = "scissor";
    
    // Function to get random value ie.Computer Choice
    private static String getComputerChoice() {
        String[] choices = {rock, paper, scissor};
        Random r = new Random();
        return choices[r.nextInt(choices.length)];
    }
    
    // Function to get output
    private static int getResult(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return 0;
        }
        if ((userChoice.equals(rock) && computerChoice.equals(scissor))
                || (userChoice.equals(paper) && computerChoice.equals(rock))
                || (userChoice.equals(scissor) && computerChoice.equals(paper))) {
            return 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Come Let's Play!!!!");
        int win = 0;
        int lose = 0;
        while (true) {
            System.out.print("Enter input: ");
            String userChoice = in.nextLine();
            String computerChoice = getComputerChoice();
            int result = getResult(userChoice, computerChoice);
            switch (result) {
                case 1:
                    System.out.println("You WIN!!!");
                    win++;
                    break;
                case -1:
                    System.out.println("You LOST!!!");
                    lose++;
                    break;
                default:
                    System.out.println("Tie!!!Try again...");
                    break;
            }
            if (win >= 5 || lose >= 5) {
                break;
            }
        }
        if (win > lose) {
            System.out.println("Congratulations!!!You WIN..");
        } else if (lose > win) {
            System.out.println("OOPS!!! You lost..Try again!!!");
        } else {
            System.out.println("Whaoh!! It's a Tie...");
        }
        System.out.println("Your score is " + win);
        System.out.println("Computer score is " + lose);
    }



}
