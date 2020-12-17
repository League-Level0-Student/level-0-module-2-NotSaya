//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();

		// 1. Use each value of randomNumber to give the user a random compliment.
int i = 0;
for (i=0; i<10; i++) {
	int randomNumber = randomMaker.nextInt(5);
	
	if (randomNumber == 0) {
		System.out.println("You look good today!");
}	
	if (randomNumber == 1) {
		System.out.println("You are very smart!");
}
	if (randomNumber == 2) {
		System.out.println("Be proud of yourself!");
}
	if (randomNumber == 3) {
		System.out.println("You're a great friend!");
}
	else {
		System.out.println("You are very inspiring!");
}
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
