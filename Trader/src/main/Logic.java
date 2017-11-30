package main;

import java.util.Scanner;

public class Logic {
	public void Run() {
		Scanner scanner = new Scanner(System.in);
		Command cmd = new Command(scanner);
		Loop(cmd, scanner);
	}
	
	public void Loop(Command cmd, Scanner scanner) {
		//Run game calculations and draw them to the screen
		while (true) {
			cmd.Input();
			System.out.println(cmd.GetData());
			break;
		}
	}
	
	public void Sell() {
		//Sell mechanic for selling raw resources and produced goods
	}
	
	public void Buy() {
		//Buy mechanic for selling raw resources and produced goods
	}
	
	public void Resources() {
		//Stores all the data for the in game resources (Money, Raw materials, Produced goods), assets, and workers
	}
	
	public void Quests() {
		//Manages the quests, whether they've been finished or not
	}
}
