package ch08;

//������ü
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();//wait�� �ٸ� �����忡�� RUNNABLE�� �ٲٷ� �ϴ� �޼ҵ�
		try {
			wait();//�������� �����带 �Ͻ�����
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();//wait�� �ٸ� �����忡�� RUNNABLE�� �ٲٷ� �ϴ� �޼ҵ�
		try {
			wait();//�������� �����带 �Ͻ�����
		}catch(InterruptedException e) {}
	}

}
