package forLoop;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Multiplication Table : ");
		int n = input.nextInt();
		
		for (int i=1; i<=12; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
			
		}

	}

}
