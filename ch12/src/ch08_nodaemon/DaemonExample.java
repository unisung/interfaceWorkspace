package ch08_nodaemon;

public class DaemonExample {
	public static void main(String[] args) {
		//������ ��ü ����
		AutoSaveThread autoSaveThread 
		  = new AutoSaveThread();
		
		System.out.println(autoSaveThread.isDaemon()?"���󾲷���":"�Ϲݾ�����");
		
		//������ ����
		autoSaveThread.start();
		
		try {
			   Thread.sleep(3000);//3�� ����
		}catch(InterruptedException e) {}
		
		System.out.println("���� ������ ����");

	}

}
