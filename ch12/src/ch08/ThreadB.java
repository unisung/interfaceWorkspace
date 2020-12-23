package ch08;

public class ThreadB extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
	   while(!stop) {
		   if(work) {
			   System.out.println("ThreadB 작업 내용");
		   }else {
			   Thread.yield();//우선순위 낮춤
		   }
	   }
	   System.out.println("ThreadB 종료");
	}
	
	

}
