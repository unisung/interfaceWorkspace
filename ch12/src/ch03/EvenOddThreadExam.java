package ch03;

public class EvenOddThreadExam {
	public static void main(String[] args) {
		Thread thread = new Thread(new EvenThread());
		Thread thread2 = new OddThread();
		
		thread.start();
		thread2.start();

	}
}
