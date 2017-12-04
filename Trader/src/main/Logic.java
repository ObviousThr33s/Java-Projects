package main;

import java.util.Scanner;

public class Logic {
	
	boolean running;
	
	public void Run() throws Exception {
		Scanner scanner = new Scanner(System.in);
		Command cmd = new Command(scanner);
		running = true;
		Loop(cmd);
	}
	
	public void Stop(Command cmd) {
		cmd.Stop();
	}
	
	public void Loop(Command cmd) throws Exception {
		//Run game calculations and draw them to the screen
		
		int c = 0;
		cmd.SetData("");
		
		while (running) {
			if (running) {
				cmd.Input();
				cmd.Output(cmd.GetData());
				cmd.Output(Integer.toString(c));
				c++;
			}
			else if (cmd.GetData().toLowerCase() == "Stop".toLowerCase()) {
				break;
			}else {
				throw new Exception("Error: You Broke Something");
			}
		}
		
		Stop(cmd);
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
