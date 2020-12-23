package ch08;

//공유객체
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();//wait된 다른 쓰레드에게 RUNNABLE로 바꾸록 하는 메소드
		try {
			wait();//실행중인 쓰레드를 일시정지
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();//wait된 다른 쓰레드에게 RUNNABLE로 바꾸록 하는 메소드
		try {
			wait();//실행중인 쓰레드를 일시정지
		}catch(InterruptedException e) {}
	}

}
