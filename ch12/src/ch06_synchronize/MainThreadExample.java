package ch06_synchronize;

public class MainThreadExample {
   //동기화 되어있지않은 공유객체 사용
	public static void main(String[] args) {
		//공유객체 생성
		Calculator calculator
		  =new Calculator();
		
		//쓰레드 접근
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		
		

	}

}
