/*Day 8: Dictionaries and Maps*/
/*we're learning about Key-Value pair mappings using a Map or Dictionary data structure*/
/*https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem*/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DayEight{
    public static void main(String []argh){
        Map<String,Integer> myMap=new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (myMap.containsKey(s))
               {
                  System.out.println(s+"="+myMap.get(s));
               }
            else
                System.out.println("Not found");
            
        }
        in.close();
    }
}
