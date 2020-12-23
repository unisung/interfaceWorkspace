package ch08_stop;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
       try {
    	   while(true) {
    		   System.out.println("실행 중");
    		   Thread.sleep(1);//1밀리초간 TIMED_WAIT상태
    	   }
       }catch(Exception e) {}
       
   	System.out.println("자원 정리");
   	System.out.println("실행 종료");
	}
	


}
