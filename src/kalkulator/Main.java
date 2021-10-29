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
		}while(!string.equals("kraj"));
	}

}
