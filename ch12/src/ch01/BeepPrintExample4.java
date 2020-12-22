package ch01;

public class BeepPrintExample4 {

	public static void main(String[] args) {
	 //쓰레드 생성
	   Thread thread = new BeepThead();
		//쓰레드 메소드 호출
        thread.start();//jvm이 thread의 run()메소드 호출
      
        Thread thread2=new PrintThingThread();
        thread2.start();
		
   
	}
}
