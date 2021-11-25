/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution18 {
    public static void main(String[] args) {
        //Prompt and input starting unit and temperature
        Scanner in = new Scanner(System.in);
        System.out.print("""
                Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.
                Your choice:\s""");
        char unit = in.next().toUpperCase().charAt(0);
        System.out.print("Please enter the temperature in "+(unit=='C'?"Fahrenheit: ":"Celsius: "));
        int temp = in.nextInt();
        //Calculate and print temperature
        double newTemp = unit=='C'? (temp-32)*(5/9d) : temp*9/5d+32;
        System.out.printf("The temperature in %s is %f%n",unit=='F'? "Fahrenheit":"Celsius",newTemp);
    }
}
