/*Day 1: Data Type*/
/*To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.*/
/*https://www.hackerrank.com/challenges/30-data-types/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
                /* Declare second integer, double, and String variables. */
        int second_i;
        double second_d;
        String second_s=null;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /* Read and save an integer, double, and String to your variables.*/
        second_i=scan.nextInt();
        scan.nextLine();
        second_d=scan.nextDouble();
        scan.nextLine();
        second_s=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
            System.out.println(i+second_i);
        /* Print the sum of the double variables on a new line. */
		    System.out.println(d+second_d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(s+(String)second_s);
