package ch01;

public class BeepPrintExample2 {

	public static void main(String[] args) {
	 //������ ����
		Runnable beepTask = new BeepTask();
		//������ ��ü ����
		Thread thread = new Thread(beepTask);//Runnable�������̽��� ������ ��ü�� 
		                                                              //Thread�������� �Ű������� ����
		//������ �޼ҵ� ȣ��
        thread.start();//jvm�� thread�� run()�޼ҵ� ȣ��
        //thread.run();//��Ƽ������ ȣ���� �ƴ�
		
        for(int i=0;i<5;i++) {
        	 System.out.println("��");
    		 try {
    			 Thread.sleep(500);
    		 }catch(Exception e) {}
        }
	}
}
