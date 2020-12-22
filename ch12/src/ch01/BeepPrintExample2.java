package ch01;

public class BeepPrintExample2 {

	public static void main(String[] args) {
	 //쓰레드 생성
		Runnable beepTask = new BeepTask();
		//쓰레드 객체 생성
		Thread thread = new Thread(beepTask);//Runnable인터페이스로 구현된 객체를 
		                                                              //Thread생성자의 매개변수로 전달
		//쓰레드 메소드 호출
        thread.start();//jvm이 thread의 run()메소드 호출
        //thread.run();//멀티쓰레드 호출이 아님
		
        for(int i=0;i<5;i++) {
        	 System.out.println("띵");
    		 try {
    			 Thread.sleep(500);
    		 }catch(Exception e) {}
        }
	}
}
