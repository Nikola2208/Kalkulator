package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner=new Scanner(System.in);
		String string;
		do {
			string = scanner.nextLine();
			if (string.equals("")){
				continue;
			}
			String[] parts = string.split(" ");
			if(parts.length!=3) {
				if(string.equals("kraj"))
					continue;
				System.out.println("Pogresan format naredbe");
				continue;
			}
			int x = Integer.parseInt(parts[0]);
			int y = Integer.parseInt(parts[2]);
			if (parts[1].equals("-")) {
				substraction(x,y);
			}
		}while(!string.equals("kraj"));
	}

	public static void substraction(int x, int y) {
		System.out.println(x-y);
	}
	
}

