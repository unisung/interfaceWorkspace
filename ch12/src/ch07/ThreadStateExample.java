package ch07;

public class ThreadStateExample {

	public static void main(String[] args) {
		//모니터링 쓰레드 객체 생성
		StatePrintThread statePrintThread
		// = new StatePrintThread(new TargetThread());
		=new StatePrintThread();
		
		statePrintThread.setTargetThread(new TargetThread());
		//실행
		statePrintThread.start();

	}

}
