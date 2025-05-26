package textAdventureGame;

import java.util.Scanner;

public class Game {
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	int playerHP;
	String playerWeapon;
	String playerName;
	int choice;
	Boolean forestVisited = false;

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
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Talk to the guard");
		System.out.println("2: Attack the guard");
		System.out.println("3: Leave");
		System.out.println("\n-------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		System.out.println("\n");
		if (choice == 1) {
			System.out.println("Guard: Hello there, stranger! So your name is " + playerName + "? Sorry, but we can't let stranger enter our town.");
			enterScanner.nextLine();
			townGate();
		} else if (choice == 2) {
			playerHP = playerHP - 1;
			System.out.println("Guard: What the hell!?\n\nThe guard hit you so hard so you gave up.\n(You received 1 damage)\n");
			System.out.println("Your HP: " + playerHP);
			enterScanner.nextLine();
			townGate();
		} else if (choice == 3) {
			crossRoad();
		} else {
			townGate();
		}
	}
	
	public void crossRoad() {
		System.out.println("\n-------------------------------------------\n");
		System.out.println("You are at the crossroad. If you go south, you will go back to the town.");
		System.out.println("1: Go north");
		System.out.println("2: Go west");
		System.out.println("3: Go south");
		System.out.println("4: Go east");
		System.out.println("\n-------------------------------------------\n");
	
		choice = myScanner.nextInt();
		
		if (choice == 1) {
			north();
		} else if (choice == 2) {
			west();
		} else if (choice == 3) {
			townGate();
		} else if (choice == 4) {
			east();
		} else {
			crossRoad();
		}
	}
	
	public void north() {
		System.out.println("\n-------------------------------------------\n");
		System.out.println("There is a river. You drink and rest at the riverside.");
		System.out.println("Your HP is recovered.");
		playerHP = playerHP + 1;
		System.out.println("Your HP: " + playerHP);
		System.out.println("\n\nGo back to the crossroad.");
		enterScanner.nextLine();
		crossRoad();
		System.out.println("\n-------------------------------------------\n");
	}
	
	public void west() {
		System.out.println("\n-------------------------------------------\n");
		
		System.out.println("\n-------------------------------------------\n");
	}
	
	public void east() {
		System.out.println("\n-------------------------------------------\n");
		if (forestVisited) {
			System.out.println("You walked into a forest. There is nothing here.");
		} else {
			System.out.println("You walked into a forest and found a Long Sword!");
			playerWeapon = "Long Sword";
			System.out.println("Your weapon: " + playerWeapon);
			forestVisited = true;
		}
		System.out.println("\n\nGo back to the crossroad.");
		enterScanner.nextLine();
		crossRoad();
		System.out.println("\n-------------------------------------------\n");
	}
}
