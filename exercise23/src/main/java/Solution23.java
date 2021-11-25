/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution23 {

    public static void main(String[] args) {
        //create decision tree to take input with if statements
        Scanner in = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        if(in.next().equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            if(in.next().equals("y")){
                System.out.println("Clean terminals then try again");
            }else{
                System.out.println("Replace cables and try again");
            }
        }else{
            //called in a separate method to reduce cognitive complexity (sonarlint)
            notSilentCar(in);
        }
    }

    static void notSilentCar(Scanner in){
        System.out.print("Does the car make a slicking noise? ");
        if(in.next().equals("y")){
            System.out.println("Replace the battery");
        }else{
            System.out.print("Does the car crank up but fail to start? ");
            if(in.next().equals("y")){
                System.out.println("Check spark plug connections");
            }else{
                System.out.print("Does the engine start and then die? ");
                if(in.next().equals("y")){
                    System.out.print("Does your car have fuel injection? ");
                    if(in.next().equals("y")){
                        System.out.println("Get it in service");
                    }else{
                        System.out.println("Check to ensure the choke is opening and closing");
                    }
                }else{
                    System.out.println("This should not be possible");
                }
            }
        }
    }

}
