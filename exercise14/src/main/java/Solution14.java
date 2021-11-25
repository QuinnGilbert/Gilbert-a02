/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.*;
public class Solution14 {

    public static void main(String[] args) {
        //prompt and input amount and state
        Scanner in = new Scanner(System.in);
        System.out.print("Enter order amount: ");
        double amount = round(in.nextDouble());
        System.out.print("Enter state: ");
        String state = in.next();
        //if state is WI tax 5.5% and output subtotal, tax
        double tax = 0;
        if(state.equals("WI")){
            tax = .055*amount;
            System.out.printf("The subtotal is $%.2f%n",amount);
            System.out.printf("The tax is $%.2f%n",tax);
        }
        //output total
        System.out.printf("The total is $%.2f%n",round(amount+tax));
    }

    static double round(double d){
        return Math.ceil(d*100)/100.0;
    }

}
