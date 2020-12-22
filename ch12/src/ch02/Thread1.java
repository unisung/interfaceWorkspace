package ch02;

//run()기능 있는 인터페이스 구현
public class Thread1 implements Runnable{

	//쓰레드로실행 가능한 메소드는 아직 아님
	@Override
	public void run() {
	  for(int  i=0;i<5;i++) {
		  System.out.println("hello");
		  try {
			  Thread.sleep(500);}catch(Exception e) {}
	  }
		
	}

}
