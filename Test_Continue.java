package week_hoony;

import java.util.Scanner;

public class Test_Continue {

	public static void main(String[] args) {
		int score = 0;
		System.out.println("점수           " + "성적");
		System.out.println("==================");
		Scanner sc = new Scanner(System.in);

	
		while (true) {
			score = sc.nextInt();
			if (score < 0) break; 
				if (score >= 90 && score <= 100) {
					System.out.println(score + "          A ");
					
				} else if (score >= 80 && score <= 89) {
					System.out.println(score + "          B ");
					
				} else if (score >= 70 && score <= 79) {
					System.out.println(score + "          c ");
					
				} else if (score >= 60 && score <= 69) {
					System.out.println(score + "          d ");
					
				} else
					System.out.println("            f");
				    	
		}
		System.out.println("종료");
		sc.close();
	}

}
