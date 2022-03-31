package week_hoony;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 몇 단을 계산할까 ? ");
//		int input = sc.nextInt();

		System.out.println("구구단을 계산한다");
		for (int i = 1; i < 10; i++) {
			System.out.println("----------------------------");
			System.out.println("구구단" + i + "단");
			System.out.println("----------------------------");

			for (int j = 0; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + j * i);

			}
			
		}

	}
}
