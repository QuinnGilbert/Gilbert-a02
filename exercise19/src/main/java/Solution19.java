/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution19 {
    public static void main(String[] args) {
        //prompt and input weight and height
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = in.nextDouble();
        System.out.print("Enter your height: ");
        double height = in.nextDouble();
        //calculate and print BMI (weight/(height*height))*703
        double bmi = (weight/(height*height))*703;
        System.out.println("Your BMI is "+bmi);
        //output appropriate message
        if(bmi<18.5){
            System.out.println("You are underweight");
        }else if(bmi<=25){
            System.out.println("You are a healthy weight");
        }else{
            System.out.println("You are overweight");
        }
    }
}
