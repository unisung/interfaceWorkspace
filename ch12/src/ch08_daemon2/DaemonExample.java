package ch08_daemon2;

public class DaemonExample {
	public static void main(String[] args) {
		//������ ��ü ����
		AutoSaveThread autoSaveThread 
		  = new AutoSaveThread();
		System.out.println(autoSaveThread.isDaemon()?"���󾲷���":"�Ϲݾ�����");
		
		//start()���� ����ó��
		autoSaveThread.setDaemon(true);
		
		//������ ����
		autoSaveThread.start();
		
		//start() �� �� ����ó���ϸ� ���� �߻�
		//autoSaveThread.setDaemon(true);
		System.out.println(autoSaveThread.isDaemon()?"���󾲷���":"�Ϲݾ�����");
		
		
		try {
			   Thread.sleep(3000);//3�� ����
		}catch(InterruptedException e) {}
		
		System.out.println("���� ������ ����");

	}

}
