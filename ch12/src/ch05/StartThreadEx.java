package ch05;

public class StartThreadEx {
//������ �켱 ����
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread"+i);
			//�������� thread�� �켱���� 5
			System.out.println("������ �켱����:"+thread.getPriority());//�켱���� ���
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);//�켱���� 1
				System.out.println("���� �켱����:"+thread.getPriority());//�켱���� ���� 
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);//�켱����10
				System.out.println("���� �켱����:"+thread.getPriority());
			}
			//jvm�� ��û-������ ����ٿ� ���
			thread.start();
		}
	}

}
//ThreadŬ������ ��ӹ��� Ŭ����
class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	//Thread���� ������ ����
	@Override
	public void run() {
	 for(int i=0;i<20000000;i++) {}//Thread.sleep�� ����� ȿ�� 
	 System.out.println(getName());//�޼ҵ�� ���
	}
	
	
}