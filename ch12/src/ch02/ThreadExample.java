package ch02;

public class ThreadExample {
public static void main(String[] args) {
   //Runnable인터페이스로 구현한 클래스는
//Thread의 생성자 매개변수로 넘겨서 생성
	Thread thread1 = new Thread(new Thread1());
	
	//Thread클래스를 상속받은 클래스는 바로 생성
	Thread thread2 = new Thread2();
	
	//run()메소드로 호출하면 쓰레드 기능을 못함.
	thread1.run();
	thread2.run();
	
	
}
}
