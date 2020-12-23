package ch03;

public class EvenOddThreadExam {
	public static void main(String[] args) {
		Thread thread = new Thread(new EvenThread());
		Thread thread2 = new OddThread();
		
		//JVM에게 실행 요청-JVM실행 스케줄에 따라 실행
		thread.start();
		thread2.start();

	}
}
