package ch01;

public class BeepPrintExample3 {

	public static void main(String[] args) {
	 //������ ����
	   Thread thread = new BeepThead();
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
