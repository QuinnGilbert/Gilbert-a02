/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution12 {
    public static void main(String[] args) {
        //prompt and input principal, rate, and years
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter rate: ");
        double rate = in.nextDouble()/100;
        System.out.print("Enter number of years: ");
        int years = in.nextInt();
        //calculate and output value p(1+rt)
        double total = principal*(1+rate*years);
        System.out.printf("After %d years at %f%%, the investment will be worth $%.2f",years,rate*100,Math.ceil(total*100)/100.0);
    }
}
