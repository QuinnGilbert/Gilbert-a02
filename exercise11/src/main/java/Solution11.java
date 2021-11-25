/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.*;
public class Solution11 {
    public static void main(String[] args) {
        //prompt and scan euros and exchange rate
        Scanner in = new Scanner(System.in);
        System.out.print("How many Euros are you exchanging? ");
        double euros = in.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = in.nextDouble();
        //calculate and print rounded up exchange in USD
        System.out.printf("%f euros at an exhange rate of %f is %.2f%n USD",euros,rate,Math.ceil(euros*rate*100)/100.0);
    }
}
/*
Input Euros
Input Rate
dollars = Euros*rate
round up with ceiling(dollars*100)
print result
 */