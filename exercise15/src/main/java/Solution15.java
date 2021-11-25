/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution15 {
    public static void main(String[] args) {
        //Prompt and input username and password
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String user = in.next();
        System.out.print("Enter your password: ");
        String pass = in.next();
        //Output whether or not they both match
        if(user.equals("QuinnG")&&pass.equals("QGilbert123!")){
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you");
        }
    }
}
