package ch08;

public class ThreadA extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
	   while(!stop) {
		   if(work) {
			   System.out.println("ThreadA �۾� ����");
		   }else {
			   Thread.yield();//�켱���� ����
		   }
	   }
	   System.out.println("ThreadA ����");
	}
	
	

}
