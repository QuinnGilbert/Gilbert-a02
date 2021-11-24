/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Prompt and scan input
        System.out.print("How many people? ");
        int people = in.nextInt();
        System.out.print("How many pizzas? ");
        int pizzas = in.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = in.nextInt();
        //calculate and print total
        int total = slices*pizzas;
        System.out.printf("%d people with %d pizzas (%d slices)%n",people,pizzas,total);
        System.out.printf("Each person gets %d slices%n",total/people);
        System.out.printf("There are %d slices left over%n", total%people);
    }
}