package ch02;

//ThreadŬ���� ���
public class Thread2 extends Thread{

	//������� ���డ���� �޼ҵ�
	@Override
	public void run() {
		  for(int  i=0;i<5;i++) {
			  System.out.println("hi");
			  try {
			  Thread.sleep(500);}catch(Exception e) {}
		  }
	}

	 
}
