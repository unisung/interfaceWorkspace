package ch08_stop;

public class PrintThread1 extends Thread{
	private boolean stop;//�ʱⰪ false

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
			while(!stop) {
				System.out.println("���� ��");
			}
			System.out.println("�ڿ� ����");
			System.out.println("���� ����");
	}
	
	
	

}
