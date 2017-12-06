/*Day 5: Loops*/
/*we're going to use loops to help us do some simple math*/
/*https://www.hackerrank.com/challenges/30-operators/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=10;i++)
            {
                
             System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
