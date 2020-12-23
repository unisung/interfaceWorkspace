package ch08_nodaemon;

public class DaemonExample {
	public static void main(String[] args) {
		//쓰레드 객체 생성
		AutoSaveThread autoSaveThread 
		  = new AutoSaveThread();
		
		System.out.println(autoSaveThread.isDaemon()?"데몬쓰레드":"일반쓰레드");
		
		//쓰레드 실행
		autoSaveThread.start();
		
		try {
			   Thread.sleep(3000);//3초 정지
		}catch(InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");

	}

}
