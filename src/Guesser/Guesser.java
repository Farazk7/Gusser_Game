package Guesser;

import java.util.Scanner;

public class Guesser {
 int guessNum;
 
 public int guessNumber() {
	 System.out.println("Guesser! Kindly guess the  number :");
	 Scanner sc = new Scanner(System.in);
	 guessNum = sc.nextInt();
	 return guessNum;
 }

}
