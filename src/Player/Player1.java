package Player;

import java.util.Scanner;

public class Player1 {
int num1;

public int guessNum() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Player1!Kindly guess the number: ");
	num1= sc.nextInt();
	return num1;
}
}
