/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.*;
public class Solution16 {
    public static void main(String[] args) {
        //prompt and input age
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        //Output whether age>=16
        System.out.printf("You are %sold enough to legally drive%n",age>=16? "":"not ");

    }
}
