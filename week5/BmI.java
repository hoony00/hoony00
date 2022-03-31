package week5;

import java.util.Scanner;

public class BmI {

	public static void main(String[] args) {
		float bmi,  heigth_M2;
		int heigth, weight;
		String name, bmi_test= null;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("키(cm)를 입력하세요 : ");
		heigth = sc.nextInt();
		System.out.print("몸무게(kg)를 입력하세요 : ");
		weight = sc.nextInt();
		
		heigth_M2 = (float) heigth/100*heigth/100;
		bmi = weight/heigth_M2;
		System.out.println(name + "님의 키는 " +  heigth + "cm이고 몸무게는 "+ weight + "kg입니다");
		if(bmi >=18.5 && bmi <= 22.9) {
			bmi_test = "정상";
		} else if ( bmi >=23 && bmi <=24.9 ) {
			bmi_test = "과체중";
		} else if ( bmi >=25 && bmi <=29.9 ){
			bmi_test = "비만";
		} else if ( bmi >=30 ){
			bmi_test = "고도비만";
		} else {
			System.out.println("BMI 기준표에 없는 등급입니다");
		}
		System.out.printf("BMI 지수는 %-3.2f이고 "+bmi_test+"입니다", bmi);
	   
	}
}
