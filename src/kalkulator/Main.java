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
		}while(!string.equals("kraj"));
	}

}
