package ch08_stop;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
       try {
    	   while(true) {
    		   System.out.println("���� ��");
    		   Thread.sleep(1);//1�и��ʰ� TIMED_WAIT����
    	   }
       }catch(Exception e) {}
       
   	System.out.println("�ڿ� ����");
   	System.out.println("���� ����");
	}
	


}
