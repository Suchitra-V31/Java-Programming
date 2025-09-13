package selectionControl;

//Implement a program to solve a quadratic equation.
//Find the discriminant value using the formula given below.
//discriminant = b2 - 4ac
//If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
//If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
//If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"
//Use the formula given below to find the roots of a quadratic equation.
//x = (-b ± discriminant)/2a
public class Assignment_2 {
    public static void main(String[] args){
        int a = 1;
        int b=4;
        int c = 4;
        float d = (b*b) - 4*a*c;
        float root1,root2;
        if(d==0){
            root1 = -b/2*a;
            System.out.println(root1);
        }
        else if(d>0){
            root1 = (-b + (d*d))/ 2*a;
            root2 = (-b - (d*d))/ 2*a;
            System.out.println(root1);
            System.out.println(root2);
        }
        else if(d<0){
            System.out.println("The equation has no real roots");
        }
    }
}
