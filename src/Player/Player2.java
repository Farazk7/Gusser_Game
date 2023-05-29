package Player;

import java.util.Scanner;

public class Player2 {
	int num2;

	public int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player2!Kindly guess the number: ");
		num2 = sc.nextInt();
		return num2;
	}
}
