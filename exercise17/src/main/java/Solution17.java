/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.*;
public class Solution17 {
    public static void main(String[] args) {
        //prompt and input gender, ounces, weight, and hours
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int gender = getNumeric(in);
        double ratio = gender==1? .73:.66;
        System.out.print("Enter ounces of alcohol: ");
        int ounces = getNumeric(in);
        System.out.print("Enter your weight in pounds: ");
        int weight = getNumeric(in);
        System.out.print("Enter hours since you last drank: ");
        int hours = getNumeric(in);
        //calculate and print BAC 5.14*A/w*r - .15h
        double bac = (5.14*ounces/weight*ratio) - .015*hours;
        System.out.println("Your BAC is "+bac);
        if(bac>=.08){
            System.out.println("It is illegal for you to drive");
        }else{
            System.out.println("It is legal for you to drive");
        }
    }

    static int getNumeric(Scanner in){
        while(true){
            try{
                String next = in.next();
                return Integer.parseInt(next);
            }catch (Exception e){
                System.out.print("You must enter a number: ");
            }
        }
    }
}
