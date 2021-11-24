/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;

public class Solution06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt age
        System.out.print("What is your current age? ");
        //input age
        int age = in.nextInt();
        //prompt retirement age
        System.out.print("What age do you want to retire? ");
        //input retirement age
        int retirement = in.nextInt();
        //get current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        //print currentYear+retirementAge-currentAge
        System.out.println("You have "+(retirement-age)+" years left to retire");
        System.out.println("It's "+currentYear+", so you can retire in "+(currentYear+retirement-age));
    }
}