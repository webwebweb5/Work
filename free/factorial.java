package forLoop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Factorial : ");
		int n = input.nextInt();
		
		int sum = 1;
		
		for (int i = 1; i <= n; i++) {
			sum *= i;
			
		}
		System.out.println(n + "!" + " = " + sum);
	}

}
