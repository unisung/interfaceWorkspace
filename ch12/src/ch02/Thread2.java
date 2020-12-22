package ch02;

//Thread클래스 상속
public class Thread2 extends Thread{

	//쓰레드로 실행가능한 메소드
	@Override
	public void run() {
		  for(int  i=0;i<5;i++) {
			  System.out.println("hi");
			  try {
			  Thread.sleep(500);}catch(Exception e) {}
		  }
	}

	 
}
