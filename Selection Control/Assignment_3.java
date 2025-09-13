package selectionControl;

import java.util.Scanner;
// Implement a program to calculate the product of three positive integer values. However, 
// if one of the integers is 7, consider only the values to the right of 7 for calculation. 
// If 7 is the last integer, then display -1.
// Note: Only one of the three values can be 7

public class Assignment_3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    int product = 1;
    if(num1!= 7 && num2!=7 && num3!=7){
        product = num1*num2*num3;
    }
    else if(num1==7){
        product = num2*num3;
    }
    else if(num2==7){
        product = num3;
    }
    else if(num3==7){
        product = -1;
    }
    System.out.println(product);
    scanner.close();
    }
}

