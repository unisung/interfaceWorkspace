package ch08_nodaemon;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ������ ������.");
	}

	@Override
	public void run() {
	   while(true) {
		   try {
			         Thread.sleep(1000);//1�ʰ����� ����
		   }catch(InterruptedException e) {
			    break;//����
		   }
		   save();//save�޼ҵ� ȣ��
	   }
	}
	
	

}
