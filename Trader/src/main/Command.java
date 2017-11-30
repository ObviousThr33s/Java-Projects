package main;

import java.util.Scanner;

public class Command {
	
	Scanner input = null;
	String data = null;
	
	Command (Scanner Scanner) {
		input = Scanner;
	}
	
	public void Input() {
		//Get input from user and format it as a string
		//Scanner input = new Scanner(System.in);
		data = input.nextLine();
		input.close();
	}
	
	public void Parse() {
		
	}
	
	public String GetData() {
		return data;
	}
}
