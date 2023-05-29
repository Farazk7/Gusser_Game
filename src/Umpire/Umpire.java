package Umpire;

import Guesser.Guesser;
import Player.Player1;
import Player.Player2;
import Player.Player3;

public class Umpire {
int numFromGuesser;
int numFromPlayer1;
int numFromPlayer2;
int numFromPlayer3;

public void collectNumberFromPlayer()
{
	Guesser g = new Guesser();
 numFromGuesser= g.guessNumber();
 
}

public void collectNumberFromGuesser() {
	
	Player1 p1 = new Player1();
	numFromPlayer1 = p1.guessNum();
	
	Player2 p2 = new Player2();
	numFromPlayer2 =p2.guessNum();
	
	Player3 p3 = new Player3();
	numFromPlayer3 = p3.guessNum();
}

public void gameTied() {
	Guesser g = new Guesser();
	 numFromGuesser= g.guessNumber();


		Player1 p1 = new Player1();
		numFromPlayer1 = p1.guessNum();
		
		Player2 p2 = new Player2();
		numFromPlayer2 =p2.guessNum();
		
		Player3 p3 = new Player3();
		numFromPlayer3 = p3.guessNum();
	 
}

public void compare() {
	
	if (numFromPlayer1==numFromGuesser) {
		if (numFromPlayer2 ==numFromGuesser && numFromPlayer3 ==numFromGuesser  ) {
		System.out.println("Everyone attempted it correctly. Please try your luck again");	
		
	}
		
		else if (numFromPlayer2 ==numFromGuesser) {
			System.out.println("Player1 & Player2 win the game");	
		}
	
		else if (numFromPlayer3 ==numFromGuesser) {
			System.out.println("Player1 & Player3 win the game");	
		}
		
		else {
			System.out.println("Only Player1 win the game");
		}
		
	}
	else if (numFromPlayer2==numFromGuesser) {
		
	if (numFromPlayer3 == numFromGuesser) {
		System.out.println("Player 2 & Player3 win the game");
	}
	else {
		System.out.println("Player 2 win");	
	}
	
	}
	else if (numFromPlayer3==numFromGuesser) {
		System.out.println("Player 3 win");	
	}
	
	else {
		System.out.println("No one wins the game . Better luck next time");
	}
}

public static void main(String[] args) {
	Umpire u = new Umpire();
	u.collectNumberFromGuesser();
	u.collectNumberFromPlayer();
	u.compare();
	
}
}
