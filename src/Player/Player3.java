package Player;

import java.util.Scanner;

public class Player3 {
	int num3;

	public int guessNum() {
		Scanner sc = new Scanner(System.in);
	System.out.println("Player3!Kindly guess the number : ");
		num3 = sc.nextInt();
		return num3;
	}
}
