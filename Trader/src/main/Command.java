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
		data = input.nextLine();
	}
	
	public void Output(String data) {
		System.out.println(data);
	}
	
	public void Parse() {
		
	}
	
	public String GetData() {
		return data;
	}
	
	public void SetData(String set) {
		data = set;
	}

	public void Stop() {
		input.close();
	}
}
