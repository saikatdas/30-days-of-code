/*Day 4: Class vs. Instance*/
/*To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.*/
/*https://www.hackerrank.com/challenges/30-class-vs-instance/
/*The problem statement has been taken from HackerRank.Credits to HackerRank and the problem setter.
I do not claim any copy right or warranty.
*/
import java.io.*;
import java.util.*;
public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge>0)
            age=initialAge;
        else{
           age=0;
           System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(age<13)
        System.out.println("You are young.");
        else if (age>=13 && age<18) 
             System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
	}

	public void yearPasses() {
  		// Increment this person's age.
        age+=1;
	}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
