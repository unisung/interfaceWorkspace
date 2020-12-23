package ch08_daemon2;

public class DaemonExample {
	public static void main(String[] args) {
		//쓰레드 객체 생성
		AutoSaveThread autoSaveThread 
		  = new AutoSaveThread();
		System.out.println(autoSaveThread.isDaemon()?"데몬쓰레드":"일반쓰레드");
		
		//start()전에 데몬처리
		autoSaveThread.setDaemon(true);
		
		//쓰레드 실행
		autoSaveThread.start();
		
		//start() 이 후 데몬처리하면 오류 발생
		//autoSaveThread.setDaemon(true);
		System.out.println(autoSaveThread.isDaemon()?"데몬쓰레드":"일반쓰레드");
		
		
		try {
			   Thread.sleep(3000);//3초 정지
		}catch(InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");

	}

}
