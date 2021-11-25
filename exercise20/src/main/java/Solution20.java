/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution20 {
    public static void main(String[] args) {
        //prompt and input amount and state
        Scanner in = new Scanner(System.in);
        System.out.print("What is the order amount: ");
        int amount = in.nextInt();
        in.nextLine();
        System.out.print("What state do you live in: ");
        String state = in.nextLine();
        double tax = 0;
        //if wisconsin, prompt and input county
        if(state.equals("Wisconsin")){
            tax = .05;
            System.out.print("What county do you live in: ");
            String county = in.nextLine();
            if(county.equals("Eau Claire")){
                tax += .005;
            }
            if(county.equals("Dunn")){
                tax += .004;

            }
        }
        if(state.equals("Illinois")){
            tax = .08;
        }
        //output total
        System.out.printf("The tax is $%.2f.%nThe total is $%.2f.",tax*amount,tax*amount+amount);
    }
}
