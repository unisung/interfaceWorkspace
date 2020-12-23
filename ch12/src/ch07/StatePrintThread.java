package ch07;

public class StatePrintThread extends Thread {
   //모니터링할 쓰레드 
	private Thread targetThread;
   
	public StatePrintThread() {}
	//생성자 -주입방식
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	//set메소드 주입방식
	public void setTargetThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	

	//쓰레드로 실행할 내용 
	@Override
	public void run() {
		while(true) {
			//상태확인 getState();
			Thread.State state = targetThread.getState();//상태값 확인
			System.out.println("타겟 쓰레드 상태:"+state);
			if(state==Thread.State.NEW) {
				targetThread.start();//실행-> RUNNABLE -jvm의 스케줄에 의해 실행
			}
			if(state==Thread.State.TERMINATED) {
				break;
			}
			
			try {
				   //0.5초간 일시 정지
				Thread.sleep(500);//StatePrintThread 정지
			}catch(Exception e) {}
		}
	}



   
	
   
}
