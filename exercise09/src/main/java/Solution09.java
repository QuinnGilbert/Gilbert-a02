/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;

public class Solution09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt and scan input
        System.out.print("What is the length? ");
        int length = in.nextInt();
        System.out.print("What is the width? ");
        int width = in.nextInt();
        //calculate and print total paint
        final double rate = 350;
        int area = length * width;
        System.out.printf("You will need %d gallons of paint to paint %d square feet%n", (int)Math.ceil(area / rate), area);
    }
}