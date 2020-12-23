package ch08_stop;

public class InterruptExample {

	public static void main(String[] args) {
		//쓰레드 객체 생성
		Thread thread = new PrintThread2();
		//쓰레드 실행
		thread.start();
		
		try {
			  Thread.sleep(1000);//Thread 일시 정지-정지상태에서 interrupt()예외 발생
		}catch(Exception e) {}
		
		//인터룹트 예외 발생
		//쓰레드가 대기/실행상태에서는 interrupt()메소드 적용 안됨
		thread.interrupt();
		
		

	}

}
