package Loops;
import java.util.*;
public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter character : ");
		char c = input.next().charAt(0);
		char[] vowels = {'a','e','i','o','u'};
        boolean result = false;
        for(int i=0;i<vowels.length;i++){
            if(c==vowels[i]){
               result = true;
            }
        }
        if(result){
             System.out.format("%c is a vowel", c);
        }
        else{
             System.out.format("%c is a consonant", c);
            }
	}
}
