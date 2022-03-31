package week_hoony;

import java.util.Scanner;

public class Test_Dowhile {

	public static void main(String[] args) {
		System.out.println("메세지 입력");
		System.out.println("프로그램 종료 키 q ");

		Scanner sc = new Scanner(System.in);
		String inputstr;

		do {
			System.out.print(">");
			inputstr = sc.nextLine();
			System.out.println(inputstr);
		} while (inputstr.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();

	}

}
