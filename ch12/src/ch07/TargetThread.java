package ch07;

public class TargetThread extends Thread{

	@Override
	public void run() {
		for(long i=0;i<100000000;i++) {}//Thread.sleep()�� ���
		try {
			//1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500);//TIMED_WAITING
		}catch(Exception e) {}
		
		for(long i=0;i<100000000;i++) {}
	}
	

}
