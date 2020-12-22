package ch04;

public class ThreadNameExample {
	//main()�޼ҵ�� main������� ����
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();//���� �������� ������ ���� ���
		System.out.println("���α׷� ���� ������ �̸�:"+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�:"+threadA.getName());//�̸���� getName()
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�:"+threadB.getName());
		threadB.start();
		
		ThreadB threadB2 = new ThreadB();
		System.out.println("�۾� ������ �̸�:"+threadB2.getName());
		threadB2.start();
	}
}

class ThreadA extends Thread{
	public ThreadA() {		setName("ThreadA"); }//������� ����.
	@Override
	public void run() {
		for(int i=0;i<2;i++) {		System.out.println(getName()+"�� ����� ����"); }
	}
}

class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=0;i<2;i++) {		System.out.println(getName()+"�� ����� ����"); }
	}
}
