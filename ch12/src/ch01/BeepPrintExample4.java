package ch01;

public class BeepPrintExample4 {

	public static void main(String[] args) {
	 //������ ����
	   Thread thread = new BeepThead();
		//������ �޼ҵ� ȣ��
        thread.start();//jvm�� thread�� run()�޼ҵ� ȣ��
      
        Thread thread2=new PrintThingThread();
        thread2.start();
		
   
	}
}
