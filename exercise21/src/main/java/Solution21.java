/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution21 {
    public static void main(String[] args) {
        //Prompt and input month
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the month: ");
        int monthNumber = in.nextInt();
        //get correct conversion
        String monthName = getMonth(monthNumber);
        //print month
        System.out.println("The name of the month is "+monthName);
    }

    static String getMonth(int n){
        return switch (n) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Out of range";
        };
    }

}
