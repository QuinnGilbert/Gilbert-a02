/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.*;
public class Solution13 {
    public static void main(String[] args) {
        //prompt and input principal, rate, years, compounds per year
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter rate: ");
        double rate = in.nextDouble()/100;
        System.out.print("Enter number of years: ");
        int years = in.nextInt();
        System.out.print("Enter number of compounds per year: ");
        int compoundsPerYear = in.nextInt();
        //calculate and print total p(1+r/n)^(n*t)
        double total = Math.ceil(principal*Math.pow(1+rate/compoundsPerYear,years*(double)compoundsPerYear)*100)/100.0;
        System.out.printf("$%.2f invested at %f%% for %d years compounded %d times per year is $%.2f%n",principal,rate*100,years,compoundsPerYear,total);
    }
}
