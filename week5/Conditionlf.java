package week5;

import java.util.Scanner;

public class Conditionlf {

	public static void main(String[] args) {
		int age, tmp;
		int year = 2022;
		System.out.println("태어난 연도 입력 : ");
		Scanner sc = new Scanner(System.in);
		tmp = sc.nextInt();
		age =  year - (tmp + 1);
		if(age <=26 && age >= 20) {
			System.out.println("대학생");
		} else if ( age <20 && age >=17 ) {
			System.out.println("고딩");
		} else {
			System.out.println("급식");
		}
		

	}

}
