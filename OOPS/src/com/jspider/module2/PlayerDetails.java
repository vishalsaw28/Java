package com.jspider.module2;

import java.util.Scanner;

public class PlayerDetails {
	
	static void showPlayerDetails(Player p) {
		if(p != null) {
			System.out.println("Player name:"+p.name);
		    System.out.println("Player Jersey no:"+p.JerseyNo);
		}
	}
	
	static Player createPlayer() {
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter player name:");
		String name = sc.next();
		
		System.out.println("Enter Player Jersey No:");
		int jno = sc.nextInt();
		
		Player p = new Player(name, jno);
		return p;
		
	}

}
