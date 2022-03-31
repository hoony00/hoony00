package week_hoony;

import java.io.IOException;

public class KeyControl {
	public static void main(String[] args) throws IOException {
		int KeyCode = 0;
		int count = 0;
		boolean run = true;
		
		System.out.println("값을 입력하세요");

		while (run) {
			KeyCode = System.in.read();

			if(KeyCode != 13 && KeyCode != 10) {
				System.out.println("입력한 값 " + (char)KeyCode + " 입니다 ");
				System.out.println("숫자를 입력하세요 (0~9");
				
				count++;
			if (count > 5)
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
