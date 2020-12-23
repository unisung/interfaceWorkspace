package ch08_stop;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		
		printThread.start();
		
		try{
			Thread.sleep(1000);//TIMED_WAIT상태
		}catch(Exception e) {}

		printThread.setStop(true);//while문의 !stop에 의해 정상 종료
		
	}

}
