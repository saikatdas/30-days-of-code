/*Day 10: Binary Numbers*/
/*we're working with binary numbers.*/
/*https://www.hackerrank.com/challenges/30-binary-numbers/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayTen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(maxConsecutiveOnes(n));
        
    }
    private static int maxConsecutiveOnes(int x)
    {
        int count = 0;
        while (x!=0)
        {
            x = (x & (x << 1));
            count++;
        }
        return count;
    }
}
