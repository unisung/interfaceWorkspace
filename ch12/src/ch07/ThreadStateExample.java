package ch07;

public class ThreadStateExample {

	public static void main(String[] args) {
		//����͸� ������ ��ü ����
		StatePrintThread statePrintThread
		// = new StatePrintThread(new TargetThread());
		=new StatePrintThread();
		
		statePrintThread.setTargetThread(new TargetThread());
		//����
		statePrintThread.start();

	}

}
