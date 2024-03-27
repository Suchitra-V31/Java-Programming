package Projects;
import java.util.*;
public class QuoteOfTheDay {
    public static void main(String[] args) {
        String[] quotes = {"Happiness is when what you think, what you say, and what you do are in harmony","Do what you love and enjoy your life!!!","Be strong and take risks in life to achieve what you want in your life!!!","Life is what you make it!!!","Always remember,If you want something in your life, belive and start working. Everything comes to you at the right moment","Life is very short friend...Always B Be Happy","It's always ok to make mistakes..It's ok to fail..But what you do after that determines who you are!!"};
        int l = quotes.length;
        Random r = new Random();
        System.out.println();
        System.out.println("Quotes of the day!!!");
        System.out.println();
        System.out.println(quotes[r.nextInt(l)]);
    }
}
