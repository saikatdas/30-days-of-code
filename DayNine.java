/*Day 9: Recursion*/
/*we're learning and practicing an algorithmic concept called Recursion*/
/*https://www.hackerrank.com/challenges/30-recursion/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayNine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution ob=new Solution();
        int result=ob.factorial(n);
        System.out.println(result);
    }
    int factorial(int n)
        {
            if(n<=1)
                return 1;
           else
               return n*factorial(n-1);
    }
}
