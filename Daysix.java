/*Day 6: Let's Review*/
/*we're expanding our knowledge of Strings and combining it with what we've already learned about loops. */
/*https://www.hackerrank.com/challenges/30-review-loop/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Daysix{

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String strEvn="";
        String strOdd="";
        for(int i=0;i<n;i++)
            {
              String str=br.readLine();
              int len=str.length();
              for(int j=0;j<len;j++)
                  {
                    if(j%2==0)
                        {
                         //it's a even one
                         strEvn+=str.charAt(j);
                    }
                  else
                      {
                      //it's a odd one.....
                      strOdd+=str.charAt(j);
                  }
                  
              }
              System.out.println(strEvn+" "+strOdd);
                  strEvn="";
                  strOdd="";
        }
        
        
    }
}
