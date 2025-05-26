package textAdventureGame;

import java.util.Scanner;

public class Game {
	Scanner myScanner = new Scanner(System.in);
	int playerHP;
	String playerWeapon;
	String playerName;
	int choice;

	public static void main(String[] args) {
		Game game;
		game = new Game();
		
		game.playerSetUp();
		game.townGate(); //starting location
	}
	
	public void playerSetUp() {
		playerHP = 10;
		
		playerWeapon = "Knife";
		
		System.out.println("Your HP: " + playerHP);
		System.out.println("Your weapon: " + playerWeapon);
		System.out.println("Please enter your name.");
		
		playerName = myScanner.nextLine();
		
		System.out.println("Hello " + playerName + ".");
	}
	
	public void townGate() {
		System.out.println("\n-------------------------------------------\n");
		System.out.println("You are at the gate of the town.");
		System.out.println("A guard is standing in front of you.");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Talk to the guard");
		System.out.println("2: Attack the guard");
		System.out.println("3: Leave");
		
		choice = myScanner.nextInt();
		
		System.out.println("\n");
		if (choice == 1) {
			System.out.println("Guard: Hello there, stranger! So your name is " + playerName);
		} else if (choice == 2) {
			System.out.println("Guard: What the hell!?\nYou fought bravely but the guard was stronger. He killed you.\n\nGAME OVER");
		} else if (choice == 3) {
			
		} else {
			System.out.println("Please type only 1, 2 or 3.");
		}
	}
}
