package ch07;

public class TargetThread extends Thread{

	@Override
	public void run() {
		for(long i=0;i<100000000;i++) {}//Thread.sleep()과 비슷
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500);//TIMED_WAITING
		}catch(Exception e) {}
		
		for(long i=0;i<100000000;i++) {}
	}
	

}
