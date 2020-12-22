package ch01;

public class PrintThingThread extends Thread{

	@Override
	public void run() {
		 for(int i=0;i<5;i++) {
        	 System.out.println("¶ò");
    		 try {
    			 Thread.sleep(500);
    		 }catch(Exception e) {}
        }
	}
	

}
