package ch08_stop;

public class InterruptExample {

	public static void main(String[] args) {
		//������ ��ü ����
		Thread thread = new PrintThread2();
		//������ ����
		thread.start();
		
		try {
			  Thread.sleep(1000);//Thread �Ͻ� ����-�������¿��� interrupt()���� �߻�
		}catch(Exception e) {}
		
		//���ͷ�Ʈ ���� �߻�
		//�����尡 ���/������¿����� interrupt()�޼ҵ� ���� �ȵ�
		thread.interrupt();
		
		

	}

}
