package com.cg.corejava.flowandexception;

import java.util.Scanner;

public class Exercise1 {

		@SuppressWarnings("resource")
		public String getMessage() {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your choice:\n1 for Red.\n2 for Yellow.\n3 for Green.");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1: return "Stop";
				case 2: return "Ready";
				case 3: return "Go";
			}
			scanner.close();
			return "";
		}
	
}
