package ch02;

//run()��� �ִ� �������̽� ����
public class Thread1 implements Runnable{

	//������ν��� ������ �޼ҵ�� ���� �ƴ�
	@Override
	public void run() {
	  for(int  i=0;i<5;i++) {
		  System.out.println("hello");
		  try {
			  Thread.sleep(500);}catch(Exception e) {}
	  }
		
	}

}
