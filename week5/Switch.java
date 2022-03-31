package week5;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int) (Math.random() * 4 + 8);  //랜덤에서 0.0부터 1.0 까지나옴 그래서 time 
		//의 최대값은 12시
		System.out.println("현재시간 : " + time + "시");
		
		switch (time) {
			case 8:
				System.out.println("출근중");
			case 9: 
				System.out.println("퇴근");
				default:
					System.out.println("나머지");
		}
	}

}
