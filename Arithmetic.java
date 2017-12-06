/*Day 0: Hello, World*/
/*To complete this challenge,Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost..*/
/*https://www.hackerrank.com/challenges/30-operators/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
          double tip=mealCost*tipPercent/100;
          double tax=mealCost*taxPercent/100;
          double tcost=mealCost+tip+tax;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(tcost);
      
        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
