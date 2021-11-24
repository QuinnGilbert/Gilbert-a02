/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt length
        System.out.print("What is the length of the room in feet?");
        //input length
        double length = in.nextDouble();
        //prompt width
        System.out.print("What is the width of the room in feet?");
        //input width
        double width = in.nextDouble();
        //calculate area
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
        double area = length*width;
        //output converted value
        System.out.println("The area is "+area+" square feet,");
        final double feet_to_meters = 0.09290304;
        double squareMeters = area*feet_to_meters;
        System.out.println("or "+squareMeters+" square meters");

    }

}