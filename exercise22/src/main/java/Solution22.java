/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution22 {

    public static void main(String[] args) {
        //prompt and input values
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();
        //check if they are equal and print the largest number
        if(num1==num2||num2==num3||num1==num3){
            System.out.println("Numbers must be different");
            return;
        }
        System.out.printf("The largest number is %d%n",max(num1,num2,num3));
    }

    static int max(int a,int b, int c){
        if(a>b&&b>c)return a;
        if(b>c&&b>a)return b;
        return c;
    }

}
