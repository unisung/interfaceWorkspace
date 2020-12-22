package ch04;

public class ThreadNameExample {
	//main()메소드는 main스레드로 실행
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();//현재 실행중인 쓰레드 정보 얻기
		System.out.println("프로그램 시작 스레드 이름:"+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름:"+threadA.getName());//이름얻기 getName()
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름:"+threadB.getName());
		threadB.start();
		
		ThreadB threadB2 = new ThreadB();
		System.out.println("작업 스레드 이름:"+threadB2.getName());
		threadB2.start();
	}
}

class ThreadA extends Thread{
	public ThreadA() {		setName("ThreadA"); }//쓰레드명 세팅.
	@Override
	public void run() {
		for(int i=0;i<2;i++) {		System.out.println(getName()+"가 출력한 내용"); }
	}
}

class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=0;i<2;i++) {		System.out.println(getName()+"가 출력한 내용"); }
	}
}
