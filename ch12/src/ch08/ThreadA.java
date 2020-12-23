package ch08;

public class ThreadA extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
	   while(!stop) {
		   if(work) {
			   System.out.println("ThreadA 작업 내용");
		   }else {
			   Thread.yield();//우선순위 낮춤
		   }
	   }
	   System.out.println("ThreadA 종료");
	}
	
	

}
