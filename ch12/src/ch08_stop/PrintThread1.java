package ch08_stop;

public class PrintThread1 extends Thread{
	private boolean stop;//초기값 false

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
			while(!stop) {
				System.out.println("실행 중");
			}
			System.out.println("자원 해제");
			System.out.println("실행 종료");
	}
	
	
	

}
