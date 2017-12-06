/*Day 3:Intro to Conditional Statements*/
/*Conditional Statements*/
/*https://www.hackerrank.com/challenges/30-conditional-statements*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ConditionalStatement {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code
          if(n>=2 && n<=5)
          ans="Not Weird";
          else if (n>=6 && n<=20)
          ans = "Weird";
          else if(n>20)
          ans="Not Weird";
      }
      System.out.println(ans);
   }
}
