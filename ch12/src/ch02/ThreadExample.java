package ch02;

public class ThreadExample {
public static void main(String[] args) {
   //Runnable�������̽��� ������ Ŭ������
//Thread�� ������ �Ű������� �Ѱܼ� ����
	Thread thread1 = new Thread(new Thread1());
	
	//ThreadŬ������ ��ӹ��� Ŭ������ �ٷ� ����
	Thread thread2 = new Thread2();
	
	//run()�޼ҵ�� ȣ���ϸ� ������ ����� ����.
	thread1.run();
	thread2.run();
	
	
}
}
