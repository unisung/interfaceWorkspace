package ch07;

public class StatePrintThread extends Thread {
   //����͸��� ������ 
	private Thread targetThread;
   
	public StatePrintThread() {}
	//������ -���Թ��
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	//set�޼ҵ� ���Թ��
	public void setTargetThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	

	//������� ������ ���� 
	@Override
	public void run() {
		while(true) {
			//����Ȯ�� getState();
			Thread.State state = targetThread.getState();//���°� Ȯ��
			System.out.println("Ÿ�� ������ ����:"+state);
			if(state==Thread.State.NEW) {
				targetThread.start();//����-> RUNNABLE -jvm�� �����ٿ� ���� ����
			}
			if(state==Thread.State.TERMINATED) {
				break;
			}
			
			try {
				   //0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);//StatePrintThread ����
			}catch(Exception e) {}
		}
	}



   
	
   
}
