/*Day 7: Arrays*/
/*we're learning about the Array data structure. */
/*https://www.hackerrank.com/challenges/30-arrays/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;


public class DaySeven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int arrLen=arr.length-1;
        for(int j=arrLen;j>=0;j--)
            {
              System.out.print(arr[j]+" ");
            }
        in.close();
    }
}
