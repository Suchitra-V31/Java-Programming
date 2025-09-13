package selectionControl;

//Problem Statement
//Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
//
//A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:
//
//Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.
//
//The below information must be used to check the validity of the data provided by the customer: 
//
//Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
//
//Distance in kms must be greater than 0.
//
//Quantity ordered should be minimum 1.
//
//If any of the input is invalid, the bill amount should be displayed as -1

public class Assignment_4 {
    public static void main(String[] args) {
        char foodType = 'V';   // 'V' for Veg, 'N' for Non-Veg
        int quantity = 2;      // Number of plates
        int distance = 7;      // Distance in km

        int foodCost = 0;
        int distanceCost = 0;

        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            System.out.println(-1);
            return; // stop execution if invalid
        }

        if (foodType == 'V') {
            foodCost = 120 * quantity;
        } else {
            foodCost = 150 * quantity;
        }

        if (distance <= 3) {
            distanceCost = 0;
        } else if (distance <= 6) {
            distanceCost = (distance - 3) * 3;
        } else {
            distanceCost = 9 + (distance - 6) * 6;
        }

        int finalBill = foodCost + distanceCost;
        System.out.println(finalBill);
    }
}

